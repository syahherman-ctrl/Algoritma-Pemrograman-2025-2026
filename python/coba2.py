
tugas = float(input("Input nilai Tugas: ")) 
uts = float(input("Input nilai UTS: ")) 
uas = float(input("Input nilai UAS: ")) 
grade = str
nilai = (0.15 * tugas) + (0.35 * uts) + (0.50 * uas) 

if nilai > 80:
    grade = "A"
elif nilai > 70:
    grade = "B"
elif nilai > 60 :
    grade = "C"
elif nilai > 50:
    grade = "D"
else:
    grade = "E"

if nilai > 60 :
    status = "LULUS"
else:
    status = "TIDAK LULUS"    

print('Nilai Akhir: %0.2f' % nilai) 
print('Grade: {}'.format(grade)) 
print('Status: {}'.format(status)) 
