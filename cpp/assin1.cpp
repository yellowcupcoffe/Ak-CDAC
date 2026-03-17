 // 6. Bitwise AND, OR and XOR
    int x,y;
  
    cout<<"Enter x value : ";
    cin>>x; // 4
    cout<<"Enter y value : ";
    cin>>y; // 5
    
    cout << "\nBitwise OR (x | y): " << (x | y) << endl;
    cout << "Bitwise XOR (x ^ y): " << (x ^ y) << endl;
    cout << "Bitwise AND (x & y): " << (x & y) << endl;
    
    // 7. Left Shift and Right Shift
    
    x = x<<2;
    y = y>>2;
    
    cout<<"\nx value after 2 left shifts: "<<x<<endl;
    cout<<"y value after 2 right shifts: "<<y<<endl;
    
    // 8. Maximum of Two Numbers using Ternary
 
    cout << "\nMax value is: " << ((x > y) ? x : y) << endl;
    
    // 9. Even or Odd Using Ternary
    
    cout << "\nx is: " << ((x % 2 == 0) ? "Even" : "Odd") << endl;
    cout << "y is: " << ((y % 2 == 0) ? "Even" : "Odd") << endl;
    
    // 10. Largest of three numbers using ternary
    
    int z;
    
    cout<<"Enter z value : ";
    cin>>z;
