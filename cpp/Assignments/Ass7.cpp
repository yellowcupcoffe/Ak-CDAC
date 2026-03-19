//Shift Operator
#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter a number: ";
    cin >> num;

    cout << "Left shift by 2: " << (num << 2) << endl;
    cout << "Right shift by 2: " << (num >> 2) << endl;
    return 0;
}