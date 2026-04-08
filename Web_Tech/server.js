// server.js
const express = require('express');
const mongoose = require('mongoose'); 
const bodyParser = require('body-parser');
const path = require('path');

const app = express();

// Middleware
app.use(bodyParser.json());

// Serve static files (HTML, CSS, JS)
app.use(express.static(__dirname));

// Connect to MongoDB
mongoose.connect('mongodb://localhost:27017/petAppointments')
    .then(() => console.log('MongoDB connected'))
    .catch(err => console.error('MongoDB connection error:', err));

// Define schema and model
const appointmentSchema = new mongoose.Schema({
    PetName: String,
    Age: Number,
    Type: String,
    Breed: String,
    OwnerName: String,
    Appointment: Date,
    OCN: String
});

const Appointment = mongoose.model('Appointment', appointmentSchema);

// POST: save new appointment
app.post('/api/appointments', async (req, res) => {
    try {
        const data = { ...req.body };
        data.Age = Number(data.Age);
        data.OCN = String(data.OCN);
        data.Appointment = new Date(data.Appointment);

        const newAppointment = new Appointment(data);
        await newAppointment.save();
        res.status(201).json({ message: 'Appointment saved!' });
    } catch (err) {
        console.error('Error saving appointment:', err);
        res.status(500).json({ error: err.message });
    }
});

// GET: fetch all appointments
app.get('/api/appointments', async (req, res) => {
    try {
        const appointments = await Appointment.find();
        res.json(appointments);
    } catch (err) {
        console.error('Error fetching appointments:', err);
        res.status(500).json({ error: err.message });
    }
});

// PUT: update appointment by ID
app.put('/api/appointments/:id', async (req, res) => {
    try {
        const id = req.params.id;
        const data = { ...req.body };

        if (data.Age) data.Age = Number(data.Age);
        if (data.OCN) data.OCN = String(data.OCN);
        if (data.Appointment) data.Appointment = new Date(data.Appointment);

        const updated = await Appointment.findByIdAndUpdate(id, data, { new: true });

        if (!updated) return res.status(404).json({ error: 'Appointment not found' });

        res.json({ message: 'Appointment updated!', appointment: updated });
    } catch (err) {
        console.error('Error updating appointment:', err);
        res.status(500).json({ error: err.message });
    }
});

// Default route: serve index2.html
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index2.html'));
});

// Start server
app.listen(3000, () => console.log('Server running on http://localhost:3000'));