tugas = float(input("Masukan Nilai Tugas : "))
uas = float(input("Masukan Nilai UTS : "))
uts = float(input("Masukan Nilai UAS : "))

nilaiakhir = (0.3 * tugas)+(0.3 * uts)+(0.4 * uas)

print("Nilai Akhir : " , nilaiakhir)

if nilaiakhir >= 60:
    print ("Status : LULUS ")
else :
    print ("Status : TIDAK LULUS ")