#include<iostream>
using namespace std;

class BankAccount{
    private:
        int accountNumber;
        string accountHolderName;
        double balance;
        static double amount;

    public:

        BankAccount() {
            accountNumber = 0;
            accountHolderName = " ";
            balance = 0.0;
        }

       
        BankAccount(int accountNumber, string name, double balance){
            this->accountNumber = accountNumber;   // ✅ added = accountNumber
            this->accountHolderName = name;       
            this->balance = balance;               
        }    


        int getAccountNumber() {
            return accountNumber;
        }

        void init(){
            cout<<"Enter Your Account Number: ";
            cin>>accountNumber;
            cin.ignore();
            cout<<"Enter Your Name: ";
            getline(cin, accountHolderName);

            do {
                cout << "Enter Your Initial Balance (above 1000): ";
                cin >> balance;

                if(balance < 1000){
                    cout << "Balance must be above 1000! Try again." << endl;
                }

            } while(balance < 1000);
        }

        void deposit(){
            cout<<"Enter the amount you want to deposit: ";
            cin>>amount;

            if(amount <= 0){
                cout<<"Can't deposit zero or negative amount!!"<<endl;
            } else {
                balance += amount;
                cout<<"Deposit successful! New balance: "<<balance<<endl;
            }
        }

        void withdraw(){
            cout<<"Enter the amount you want to withdraw: ";
            cin>>amount;

            if(amount > balance){
                cout<<"Insufficient Balance!"<<endl;
            } else {
                balance -= amount;
                cout<<"Withdrawal successful! New balance: "<<balance<<endl;
            }
        }

        void displayBal(){
            cout<<"Balance : "<<balance<<endl;
        }

        void totalDisplay(){
            cout<<"<====== Account Details ======>"<<endl;
            cout<<"Account Number : "<< accountNumber<<endl;
            cout<<"Name           : "<< accountHolderName<<endl;
            cout<<"Balance        : "<< balance<<endl;  
        }
};

double BankAccount::amount = 0.0;

int findAccount(BankAccount b[], int n, int accNo) {
    for (int i = 0; i < n; i++) {
        if (b[i].getAccountNumber() == accNo)
            return i;
    }
    return -1;
}

int main(){

    int n, choice;
    cout<<"Enter no of Account Holders: ";
    cin>>n;

    BankAccount b[n];

    do {
        cout<<"\n===========Account Menu==========="<<endl;
        cout<<"1. Create Account"<<endl;
        cout<<"2. Deposit Amount"<<endl;
        cout<<"3. Withdraw Amount"<<endl;
        cout<<"4. Display Account Details"<<endl;
        cout<<"5. Display Balance"<<endl;
        cout<<"6. Exit"<<endl;
        cout<<"Enter your Choice: ";
        cin>>choice;
        cin.ignore();

        switch(choice) {

            case 1:
                for(int i = 0; i < n; i++) {
                    b[i].init();
                }
                cout<<"Thanks for Banking with us :)!"<<endl;
                break;

            case 2: {
                int accNo;
                cout<<"Enter Account Number: ";
                cin>>accNo;
                cin.ignore();
                int idx = findAccount(b, n, accNo);
                if(idx == -1)
                    cout<<"Account not found!"<<endl;
                else
                    b[idx].deposit();
                break;
            }

            case 3: {
                int accNo;
                cout<<"Enter Account Number: ";
                cin>>accNo;
                cin.ignore();
                int idx = findAccount(b, n, accNo);
                if(idx == -1)
                    cout<<"Account not found!"<<endl;
                else
                    b[idx].withdraw();
                break;
            }

            case 4: {
                int accNo;
                cout<<"Enter Account Number: ";
                cin>>accNo;
                cin.ignore();
                int idx = findAccount(b, n, accNo);
                if(idx == -1)
                    cout<<"Account not found!"<<endl;
                else
                    b[idx].totalDisplay();
                break;
            }

            case 5: {
                int accNo;
                cout<<"Enter Account Number: ";
                cin>>accNo;
                cin.ignore();
                int idx = findAccount(b, n, accNo);
                if(idx == -1)
                    cout<<"Account not found!"<<endl;
                else
                    b[idx].displayBal();
                break;
            }

            case 6:
                cout<<"Exiting....."<<endl;
                break;

            default:
                cout<<"Invalid choice!!"<<endl;
                break;
        }

    } while(choice != 6);

    return 0;
}