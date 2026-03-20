#include <iostream>
using namespace std;

#define MAX 10

void mutiplayMatrix(int A[MAX][MAX], int B[MAX][MAX], int C[MAX][MAX], int rA, int cA, int rB, int cB) {
    for (int i = 0; i < rA; i++) {
        for (int j = 0; j < cB; j++) {
            C[i][j] = 0;
            for (int k = 0; k < cA; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }
}

void printMatrix(int M[MAX][MAX], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cout << M[i][j] << "\t";
        }
        cout << endl;
    }
}

int main() {
    int A[MAX][MAX], B[MAX][MAX], C[MAX][MAX], rA, cA, rB, cB;

    cout << "Enter Rows and Columns of A: ";
    cin >> rA >> cA;

    cout << "Enter Rows and Columns of B: ";
    cin >> rB >> cB;

    if (cA != rB) {
        cout << "Invalid! Cols of A must equal Rows of B." << endl;
        return 0;
    }

    cout << "\nEnter elements of A:" << endl;
    for (int i = 0; i < rA; i++)
        for (int j = 0; j < cA; j++)
            cin >> A[i][j];

    cout << "Enter elements of B:" << endl;
    for (int i = 0; i < rB; i++)
        for (int j = 0; j < cB; j++)
            cin >> B[i][j];

    cout << "\nMatrix A:" << endl;
    printMatrix(A, rA, cA);

    cout << "\nMatrix B:" << endl;
    printMatrix(B, rB, cB);

    mutiplayMatrix(A, B, C, rA, cA, rB, cB);

    cout << "\nResult C = A x B:" << endl;
    printMatrix(C, rA, cB);

    return 0;
}