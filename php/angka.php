<?php
    $a = readline("Masukan angka pertama : ");
    $b = readline("Masukan angka kedua : ");

    if ($a > $b)
        echo "$a lebih besar dari $b";
    else 
        echo "keduanya sama besar \n";

    echo "Apakah Keduanya sama ? ";
    echo ($a == $b)? " true \n":" false \n";

    
?>