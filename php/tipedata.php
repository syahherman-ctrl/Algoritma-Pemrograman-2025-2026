<?php 
    $nim = 'A'; 
    $nama = "Muhammad Encep"; 
    $umur = 36; 
    $nilai = 82.25; 
    $status = TRUE; 
 
    echo "---Belajar Tipe Data --- \n";
    echo "Tipe Data Char : " . $nim  . "\n"; 
    echo "Tipe Data String :". $nama . "\n"; 
    print "Tipe Data Int : " . $umur; 
    print "\n"; 
    printf("Tipe Data Float : %.5f", $nilai . "\n"); 
    print "\n";
    echo "Tipe Data Boolean : " . " \n"; 
        
    if ($status) 
        echo "Status : Aktif"; 
    else 
        echo "Status : Tidak Aktif"; 
?>