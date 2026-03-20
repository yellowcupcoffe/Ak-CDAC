#include <iostream>
using namespace std;

#define ROW_MAX 100
#define COL_MAX 100

int main() {
    
    // Defining, initializing and displaying 2D array using user input

    // 1st matrix input
    int Arr1[ROW_MAX][COL_MAX];
    int row1, col1,i ,j;
    
    cout << "Enter the size of the matrix :\n";
    cout << "Rows: ";
    cin >> row1;
    cout << "Columns: ";
    cin >> col1;

    cout << "\nEnter the elements of the matrix :\n";
    for(i = 0; i < row1; i++) {
        for(j = 0; j < col1; j++) {
            cin >> Arr1[i][j];
        }
    }

    cout << "\nEntered Matrix :\n";
    for(i = 0; i < row1; i++) {
        for(j = 0; j < col1; j++) {
            cout << Arr1[i][j] << " ";
        }
        cout << "\n";
    }

    int mattrans[ROW_MAX][COL_MAX];
    for(i = 0; i < col1; i++) {
        for(j = 0; j < row1; j++) {
            mattrans[i][j] = Arr1[j][i];
        }
    }

    cout<<"Transposed Matrix :\n";

    for(i = 0; i < col1; i++) {
        for(j = 0; j < row1; j++) {
            cout << mattrans[i][j] << " ";
        }
        cout << "\n";
    }


    return 0;
}