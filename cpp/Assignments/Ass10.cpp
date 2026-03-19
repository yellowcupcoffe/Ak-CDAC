//Ternary Operator
#include <iostream>
using namespace std;

int main() {
    int x, y;
    cout << "Enter two numbers: ";
    cin >> x >> y;

    int max = (x > y) ? x : y;
    cout << "Maximum = " << max << endl;
    return 0;

    //Even Odd

    int n;
    cout << "Enter a number: ";
    cin >> n;

    string result = (n % 2 == 0) ? "Even" : "Odd";
    cout << n << " is " << result << endl;
    return 0;

    //Largest of 3
    int a, b, c;
    cout << "Enter three numbers: ";
    cin >> a >> b >> c;

    int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    cout << "Largest = " << largest << endl;
    return 0;
}