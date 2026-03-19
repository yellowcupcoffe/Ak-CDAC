// Area of Rectangle
#include <iostream>
using namespace std;

int main() {
    double length, breadth;
    cout << "Enter length and breadth of rectangle: ";
    cin >> length >> breadth;

    double area = length * breadth;
    cout << "Area of rectangle = " << area << endl;
    return 0;
}