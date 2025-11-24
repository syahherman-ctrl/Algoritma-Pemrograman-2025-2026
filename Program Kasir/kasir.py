nama = input ("Masukan Nama Barang : ")
harga = float(input("Masukan Harga Barang : "))
jumlah = int(input("Masukan Jumlah Barang : "))

total = harga * jumlah

if total > 85700:
    diskon = total * 0.07
else:
    diskon = 0

    totalBayar = total - diskon

print("\n=========STRUK PEMBELIAN=========") 
print(f"Nama Barang   : {nama}")
print(f"Harga Barang  : Rp. {harga}")
print(f"Jumlah Barang : {jumlah}")
print(f"Total Harga   : Rp. {total}")
print(f"Diskon        : Rp. {diskon}")
print(f"Total Bayar   : Rp. {totalBayar}")
print("=================================")
    