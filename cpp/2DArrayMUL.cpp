#include <iostream>
using namespace std;

#define ROW_MAX 100
#define COL_MAX 100

int main() {
    
    // Defining, initializing and displaying 2D array using user input

    // 1st matrix input
    int Arr1[ROW_MAX][COL_MAX];
    int row1, col1,i ,j;
    
    cout << "Enter the size of the matrix 1:\n";
    cout << "Rows: ";
    cin >> row1;
    cout << "Columns: ";
    cin >> col1;

    cout << "\nEnter the elements of the matrix 1:\n";
    for(i = 0; i < row1; i++) {
        for(j = 0; j < col1; j++) {
            cin >> Arr1[i][j];
        }
    }

    cout << "\nEntered Matrix 1:\n";
    for(i = 0; i < row1; i++) {
        for(j = 0; j < col1; j++) {
            cout << Arr1[i][j] << " ";
        }
        cout << "\n";
    }

    // 2nd matrix input

    int Arr2[ROW_MAX][COL_MAX];
    int row2, col2;
    
    cout << "\nEnter the size of the matrix 2:\n";
    cout << "Rows: ";
    cin >> row2;
    cout << "Columns: ";
    cin >> col2;

    cout << "\nEnter the elements of the matrix 2:\n";
    for(i = 0; i < row2; i++) {
        for(j = 0; j < col2; j++) {
            cin >> Arr2[i][j];
        }
    }

    cout << "\nEntered Matrix 2:\n";
    for(i = 0; i < row2; i++) {
        for(j = 0; j < col2; j++) {
            cout << Arr2[i][j] << " ";
        }
        cout << "\n";
    }

    // 2D array(matrix) multiply

    int matmul[ROW_MAX][COL_MAX];
    
    for(i = 0; i < row1; i++) {
        for(j = 0; j < col2; j++) {
            matmul[i][j] = 0;
            for(int k = 0; k < col1 ; k++) {
                matmul[i][j] = matmul[i][j] + (Arr1[i][k] * Arr2[k][j]);
            }
        }
    }

    cout << "\nMul Matrix :\n";
    for(i = 0; i < row1; i++) {
        for(j = 0; j < col2; j++) {
            cout << matmul[i][j] << " ";
        }
        cout << "\n";
    }

    return 0;
}