<?php
    $nama = readline("Masukan Nama Barang : ");
    $jumlah = readline("Masukan Jumlah Barang : ");
    $harga = readline("Masukan Harga Barang : ");

    $total = $harga * $jumlah;

    if ($total > 85700)
        echo $diskon = $total * 0.07;
    else{
        echo $diskon = 0;
    }

    $totalBayar = $total - $diskon;

    echo "\n======================================\n";
    echo "Nama Barang : ",$nama,"\n";
    echo "Jumlah Barang : ",$jumlah,"\n";
    echo "Harga Barang : ",$harga,"\n";
    echo "Total Diskon : ",$diskon,"\n";
    echo "Total Bayar : ",$totalBayar,"\n";

?>