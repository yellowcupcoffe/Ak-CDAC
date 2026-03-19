#include <iostream>
#include <climits>
using namespace std;

#define SEATS 50

int booked[SEATS] = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0,
                     1, 1, 0, 0, 1, 0, 0, 1, 1, 0,
                     1, 0, 1, 0, 0, 1, 1, 0, 1, 0,
                     0, 1, 1, 0, 1, 0, 1, 1, 0, 0,
                     1, 0, 0, 1, 1, 0, 1, 0, 1, 0};

int Bcount = 0;
int Acount = 0;

void bookingDetails()
{
    Bcount = 0; Acount = 0;
    for (int i = 0; i <= SEATS - 1; i++)
    {
        if (booked[i] != 1)
            Acount++;
        else
            Bcount++;
    }
    cout << "Available seats: " << Acount << endl;
    cout << "Booked  seats:   " << Bcount << endl;
}

void AvailableSeats()
{
    int avb[SEATS];  
    int idx = 0;
    for (int i = 0; i <= SEATS - 1; i++)
    {
        if (booked[i] == 0)
            avb[idx++] = i + 1;
    }

    cout << "Available Seat numbers: ";
    for (int i = 0; i < idx; i++)   
    {
        cout << "[ " << avb[i] << " ],";
    }
    cout << endl;
}

void FirstSeatBook()
{
    for (int i = 0; i < SEATS; i++)
    {
        if (booked[i] == 0)
        {
            booked[i] = 1;
            cout << "Seat " << i + 1 << " booked successfully." << endl;
            return;
        }
    }
    cout << "No available seats." << endl;
}




void AvailabeOrNot()
{
    int n;
    cout << "Enter which seat you wanna check for availability: ";
    cin >> n;

    if (n < 1 || n > SEATS)
    {
        cout << "Invalid seat number." << endl;
        return;
    }

    if (booked[n - 1] == 0)
        cout << "Yes, seat " << n << " is available!" << endl;
    else
        cout << "Sorry, seat " << n << " is booked :(" << endl;
}


void LastSeatAvb()
{
    for (int i = SEATS; i > 0; i--)
    {
        if (booked[i] == 0)
        {
            
            cout <<"Last Availbe seat is "<< i;
            return;
        }
    }
    cout << "No available seats." << endl;
}

int main()
{
    bookingDetails();
    //AvailabeOrNot();
    LastSeatAvb();
    return 0;
}