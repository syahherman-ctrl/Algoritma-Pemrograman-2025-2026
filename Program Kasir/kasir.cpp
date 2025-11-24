#include <iostream>
#include <conio.h>
using namespace std;

    int main(){
        string nama;
        int jumlah;
        float harga,diskon,totalBayar,total;

        cout << "Masukan Nama Barang : ";
        cin >> nama;
        cout << "Masukan Harga Barang : ";
        cin >> harga;
        cout << "Masukan Jumlah Barang : ";
        cin >> jumlah;

        total = jumlah * harga;

        if (total > 85700)
            diskon = total * 0.07;
        else
            diskon = 0;

        totalBayar = total - diskon;

        cout << "==============================="<<endl;
        cout << "Nama Barang : "<<nama<<endl;
        cout << "Harga Barang : "<<harga<<endl;
        cout << "Jumlah Barang : "<<jumlah<<endl;
        cout << "Total Harga : "<<total<<endl;
        cout << "Total Diskon : "<<diskon<<endl;
        cout << "Total Bayar : "<<totalBayar<<endl;
        
    }