//Sum of first n numbers

#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter n: ";
    cin >> n;

    int sum = n * (n + 1) / 2; // Formula
    cout << "Sum of first " << n << " numbers = " << sum << endl;
    return 0;
}