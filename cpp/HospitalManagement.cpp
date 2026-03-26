#include<iostream>
#include<vector>
using namespace std;

class Doctor{
    public:
    int doctor_id;
    string name;
    string specialization;
    vector<string> degrees;
    Doctor(){}



    Doctor(int doctor_id,string name, string specialization,vector<string> degrees){
        this->doctor_id = doctor_id;
        this->name = name;
        this->specialization = specialization;
        this->degrees = degrees;
    }

    

    void displayDoctorInfo(){
        cout<<"ID: "<< doctor_id;
        cout<<"Name: Dr."<<name<<endl;
        cout<<"Specialization : " << specialization<<endl;
        for(int i=0;i<degrees.size();i++){
            cout<<degrees[i] << " ";
        }
    }
};


Doctor createDoctor(){

    int doctor_id;
    string name;
    string specialization;
    vector<string> degrees;

        cout<<"Enter Doctor ID: ";
        cin>> doctor_id;
        
        cin.ignore();
        cout<<"Enter Doctor Name: ";
        getline(cin, name);

        cout<<"Enter Specialization: ";
        getline(cin, specialization);

        int n;
        cout<<"Enter Number of Degrees: ";
        cin>>n;

        string temp;
         degrees;
        cout<<"Enter The Degrees: ";
        for(int i=0;i<n;i++){
            cin >> temp;
            degrees.push_back(temp);

        }

        return  Doctor(doctor_id,name,specialization,degrees);
    }

class Patient{
    public:
    int patient_id;
    string Pname;
    int age;
    float weight;
    string disease;
    string previous_health_report;
    Patient(){}


    Patient(int patient_id, string Pname, int age,float weight, string disease, string previous_health_report){
        this->patient_id = patient_id;
        this->Pname = Pname;
        this->age = age;
        this->weight = weight;
        this->disease = disease;
        this->previous_health_report = previous_health_report;
        
    }

    void displayPatientInfo(){
        cout<<"Patient ID: " << patient_id;
        cout<<"Patient Name: "<< Pname<<endl;
        cout<<"Age:"<< age<<endl;
        cout<<"weight: "<<weight;
        cout<<"Disease: "<< disease;
        cout<<"Privous Health Report: "<< previous_health_report;
    }


   Patient createPatient(){
            cout<<"Enter Patient ID: ";
            cin>>patient_id;
            
            cin.ignore();
            cout<<"Enter Patient Name: ";
            getline(cin, Pname);

            cout<<"Enter Age: ";
            cin>>age;

            cout<<"Enter Weight: ";
            cin>>weight;

            cout<<"Enter Disease: ";
            getline(cin, disease);

            cout<<"Enter Privous Health Report: ";
            cin>>previous_health_report;


            return Patient( patient_id,  Pname,  age, weight,  disease,  previous_health_report);
    }


};


    Patient createPatient(){
        int patient_id;
        string Pname;
        int age;
        float weight;
        string disease;
        string previous_health_report;

            cout<<"Enter Patient ID: ";
            cin>>patient_id;
            
            cin.ignore();
            cout<<"Enter Patient Name: ";
            getline(cin, Pname);

            cout<<"Enter Age: ";
            cin>>age;

            cout<<"Enter Weight: ";
            cin>>weight;

            cout<<"Enter Disease: ";
            getline(cin, disease);

            cout<<"Enter Privous Health Report: ";
            cin>>previous_health_report;


            return Patient( patient_id,  Pname,  age, weight,  disease,  previous_health_report);
    }

class Treatment: public Doctor , public Patient {
    public:
    string procedure;
    string conclusion;
    string medicine;
    string next_visit_date;
    bool is_admitted;
    Treatment(): Doctor(), Patient(){}


    Treatment (string procedure,string conclusion,string medicine,string next_visit_date,bool is_admitted, Doctor d , Patient p) :Doctor( d.doctor_id, d.name,  d.specialization, d.degrees), Patient( p.patient_id,  p.Pname,  p.age, p.weight,  p.disease,  p.previous_health_report) {
            this->procedure = procedure;
            this->conclusion=conclusion;
            this->medicine = medicine;
            this->next_visit_date = next_visit_date;
            this->is_admitted = is_admitted;

    }

    void displayTreatmentDetails(){
        displayDoctorInfo();
        displayPatientInfo();
        cout<<"Procedure: " << procedure<< endl;
        cout<<"Prescription: "<< medicine<< endl;
        cout<<"Conclusion: "<< conclusion << endl;
        cout<<"Next Date of Visit: "<<next_visit_date<<endl;
        if(is_admitted == 0){
            string ans = "NO";
            cout<<"Should Patient be Admited : " << ans<< endl;
        } else {
            string ans = "YES";
            cout<<"Should Patient be Admited : " << ans<< endl;
        }
        
    }


     Treatment createTreatment(Doctor d, Patient p){
            cin.ignore();
            cout<<"Enter Procedure : ";
            getline(cin,procedure);

            cout<<"Enter Conculsion: ";
            getline(cin,conclusion);

            cout<<"Enter Prescription: ";
            getline(cin,medicine);

            cout<<"Enter Next Visit Date: ";
            getline(cin,next_visit_date);

            cout<<"Enter if the Patient should be Admitted or not: ";
            cin>> is_admitted;

        return Treatment(procedure, conclusion,medicine,next_visit_date,is_admitted, d, p);
    }
};

 Treatment createTreatment(Doctor d, Patient p){

            string procedure;
            string conclusion;
            string medicine;
            string next_visit_date;
            bool is_admitted;

            cin.ignore();
            cout<<"Enter Procedure : ";
            getline(cin,procedure);

            cout<<"Enter Conculsion: ";
            getline(cin,conclusion);

            cout<<"Enter Prescription: ";
            getline(cin,medicine);

            cout<<"Enter Next Visit Date: ";
            getline(cin,next_visit_date);

            cout<<"Enter if the Patient should be Admitted or not: ";
            cin>> is_admitted;

        return Treatment(procedure, conclusion,medicine,next_visit_date,is_admitted, d, p);
    }


int main(){

int choice;
    Doctor d;
    Patient p;
    Treatment t;

    do {
        cout<<"\n--- Hospital Management System ---\n";
        cout<<"1. Create Doctor\n";
        cout<<"2. Create Patient\n";
        cout<<"3. Create Treatment\n";
        cout<<"4. Display Treatment\n";
        cout<<"5. Exit\n";
        cout<<"Enter Choice: ";
        cin>>choice;

        switch(choice){
            case 1: d = createDoctor(); break;
            case 2: p = createPatient(); break;
            case 3: t = createTreatment(d, p); break;
            case 4: t.displayTreatmentDetails(); break;
            case 5: cout<<"Exiting...\n"; break;
            default: cout<<"Invalid Choice\n";
        }
    } while(choice != 5);





    return 0;
}