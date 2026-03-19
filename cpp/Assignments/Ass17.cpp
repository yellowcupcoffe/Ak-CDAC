//Prime No
#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    if (n <= 1) {
        cout << n << " is not prime." << endl;
    } else {
        bool isPrime = true;
        for (int i = 2; i * i <= n; i++) { // Check up to sqrt(n)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            cout << n << " is prime." << endl;
        else
            cout << n << " is not prime." << endl;
    }

    return 0;
}