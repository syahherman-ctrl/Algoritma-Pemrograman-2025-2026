#include<stdio.h>
#include<conio.h>
#include<iostream>
using namespace std;

main(){
    char a[30] = "---BELAJAR TIPE DATA---";
    short b;
    int c;
    long d;
    float e;
    double f;
    int g = 1;
    int h = 2;

    b = 10000;
    c = 1000000;
    e = 3.12;
    f = 3.12345;

    cout<<a<<endl;
    cout<<"Tipe Data Short : "<<b<<endl;
    cout<<"Tipe Data Int : "<<c<<endl;
    cout<<"Tipe Data Long : "<<d<<endl;
    cout<<"Tipe Data float : "<<e<<endl;
    cout<<"Tipe Data Double : "<<f<<endl;
    cout<<endl;

    cout<<"Berikut Hasil Boolean : "<<endl;
    cout<<(g>h);
    cout<<endl;
    cout<<(g<h);
    cout<<endl;
    cout<<(g==h);
    cout<<endl;
    cout<<(g!=h);
}