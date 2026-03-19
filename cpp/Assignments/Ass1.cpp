// Addition
#include <iostream>
#include <cmath>
using namespace std;

// Function to convert binary (entered as int) to decimal
int binaryToDecimal(int n) {
    int decimal = 0, base = 1;
    while (n > 0) {
        int lastDigit = n % 10;
        decimal += lastDigit * base;
        base *= 2;
        n /= 10;
    }
    return decimal;
}

// Function to convert decimal to binary (returns int)
int decimalToBinary(int n) {
    int binary = 0, base = 1;
    while (n > 0) {
        int rem = n % 2;
        binary += rem * base;
        base *= 10;
        n /= 2;
    }
    return binary;
}

int main() {
    int choice;
    cout << "Addition Menu:\n";
    cout << "1. Add two integers\n";
    cout << "2. Add two binary numbers\n";
    cout << "3. Add two characters (ASCII sum)\n";
    cout << "Enter your choice (1-3): ";
    cin >> choice;

    switch(choice) {
        case 1: {
            int a, b;
            cout << "Enter two integers: ";
            cin >> a >> b;
            cout << "Sum = " << (a + b) << endl;
            break;
        }
        case 2: {
            int bin1, bin2;
            cout << "Enter two binary numbers: ";
            cin >> bin1 >> bin2;
            int dec1 = binaryToDecimal(bin1);
            int dec2 = binaryToDecimal(bin2);
            int sum = dec1 + dec2;
            cout << "Sum in binary = " << decimalToBinary(sum) << endl;
            break;
        }
        case 3: {
            char ch1, ch2;
            cout << "Enter two characters: ";
            cin >> ch1 >> ch2;
            int sum = ch1 + ch2; // ASCII addition
            cout << "ASCII sum = " << sum << endl;
            break;
        }
        default:
            cout << "Invalid choice!" << endl;
    }

    return 0;
}