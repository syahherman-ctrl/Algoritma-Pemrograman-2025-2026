#include <iostream>
using namespace std;

int main (){
    int a,b;
    cout << "Masukan Angka Pertama : ";
    cin >> a;
    cout << "Masukan Angka Kedua : ";
    cin >> b;

    if (a>b)
        cout << a << " Lebih besar dari " << b << endl;
    else 
        cout << "Keduanya sama Besar "<< endl;

        cout << "Apakah keduanya sama ? " << (a==b);
}