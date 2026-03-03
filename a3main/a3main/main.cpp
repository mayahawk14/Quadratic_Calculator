#include <iostream>

using namespace std;

void mathIt(int a, int b, int c, double disc, bool oneSol) {
    int square = sqrt(abs(disc));
    double rs = -b + square;
    double denom = 2*a;
    double first = rs/denom;

    //x2
    double rs2 = -b - square;
    double denom2 = 2*a;
    double second = rs2/denom2;
    

    if (oneSol == true){
        
        cout << first << endl;
    }
    else {
        string f = "(" + to_string(first);
        string s = to_string(second) + ")";
        cout << f;
        cout << ", ";
        cout << s << endl;
    }
}

void aEqul0(int b, int c) {
    int x = -c/b;
    cout << "One real solution" << endl;
    cout << x;
}

int CALCULATE (int a, int b, int c) {
    double disc = pow(b,2) - 4*a*c;
    bool oneSol = true;
    if (disc < 0) {
        cout << "Two distinct complex solutions" << endl;        
        double square = sqrt(abs(disc));
        double front = -b/2 * a;

        string first = "(" + to_string(front) + " + " + to_string(square) + "i";
        string second = to_string(front) + " - " + to_string(square) + "i)";

        cout << first;
        cout << ", ";
        cout << second << endl;
        return 0;
    }
    else if (disc == 0) {
        cout << "One real solution" << endl;
    }
    else{
        cout << "Two real solutions" << endl;
        oneSol = false;
    }
    mathIt(a,b,c,disc,oneSol);
    
    return 0;
}

int main() {
    int a;
    int b;
    int c;
    
    cout << "Enter A, B, and C values (enter after each number): ";
    
    cin >> a;
    
    cin >> b;
    
    cin >> c;


    if (a == 0) {
        aEqul0(b, c);
    }
    else {
        CALCULATE(a, b, c);
    }
}
