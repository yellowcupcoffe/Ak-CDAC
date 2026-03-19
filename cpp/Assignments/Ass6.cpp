//Bitwise Operator
#include <iostream>
using namespace std;

int main() {
    int a, b;
    cout << "Enter two integers: ";
    cin >> a >> b;

    cout << "Bitwise OR (|) = " << (a | b) << endl;
    cout << "Bitwise AND (&) = " << (a & b) << endl;
    cout << "Bitwise XOR (^) = " << (a ^ b) << endl;
    return 0;
}