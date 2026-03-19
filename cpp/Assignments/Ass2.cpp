//COmpound interest
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double P, r, t;
    int n;
    cout << "Enter principal amount: ";
    cin >> P;
    cout << "Enter annual interest rate (in %): ";
    cin >> r;
    cout << "Enter time (years): ";
    cin >> t;
    cout << "Enter number of times interest is compounded per year: ";
    cin >> n;

    double CI = P * pow(1 + (r / 100) / n, n * t) - P;
    cout << "Compound Interest = " << CI << endl;
    return 0;
}