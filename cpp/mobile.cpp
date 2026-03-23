#include<iostream>
#include <algorithm>
#include<limits>
using namespace std;

int cheapest(int Prices[], int n){
    int min = INT_MAX;
    for(int i=0;i<n;i++){
         min = std::min(min, Prices[i]);
    }
    return min;
}

int Costliest(int Prices[], int n){
    int max = INT_MIN;
    for(int i=0;i<n;i++){
         max = std::max(Prices[i], max);
    }
    return max;
}

int partition(int Prices[], int low, int high){
    int pivot = Prices[high];
    int i = low - 1;

    for(int j = low; j < high; j++){
        if(Prices[j] <= pivot){
            i++;
            swap(Prices[i], Prices[j]);
        }
    }
    swap(Prices[i+1], Prices[high]);
    return i + 1;
}

void quickSort(int Prices[], int low, int high){
    if(low < high){
        int pi = partition(Prices, low, high);
        quickSort(Prices, low, pi - 1);
        quickSort(Prices, pi + 1, high);
    }
}

void display(int Prices[], int n){
    cout<<"These are the Prices of the Mobile phones: ";
    for(int i=0;i<n;i++){
        cout<<Prices[i] << " ";
    }
}

void displaySorted(int Prices[], int n){
    int temp[n];
    for(int i=0;i<n;i++) temp[i] = Prices[i];  // copy so original stays intact

    quickSort(temp, 0, n-1);

    cout<<"Sorted Prices (Low to High): ";
    for(int i=0;i<n;i++){
        cout<<temp[i] << " ";
    }
}

int main(){
    int n = 0;
    cout<<"Enter The number of Phones: ";
    cin>> n;
    int Prices[n];

    for(int i=0;i<n;i++){
        cout<<"Enter the Price of phone " <<i+1<< ": ";
        cin>>Prices[i];
    }

    display(Prices, n);
    cout<<endl;

    displaySorted(Prices, n);
    cout<<endl;

    int res  = cheapest(Prices, n);
    int res2 = Costliest(Prices, n);
    cout<<"The Cheapest phone is "  << res  << endl;
    cout<<"The Costliest phone is " << res2 << endl;

    return 0;
}