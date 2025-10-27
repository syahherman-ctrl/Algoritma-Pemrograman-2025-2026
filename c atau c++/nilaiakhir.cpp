#include <iostream>
#include <conio.h>
using namespace std;

int main ( ){
    float tugas,uts,uas,nilaiAkhir;
    cout << "Masukan Nilai Tugas : ";
    cin >> tugas;
    cout << "Masukan Nilai UTS : ";
    cin >> uts;
    cout << "Masukan Nilai UAS : ";
    cin >> uas;
    
    nilaiAkhir = (0.3 * tugas)+(0.3 * uts)+(0.4 * uas);

    cout << "Nilai Akhir = " << nilaiAkhir << endl;
    if (nilaiAkhir >= 60)
        cout << "Status : LULUS ";
    else 
        cout << "Status : TIDAK LULUS ";
}