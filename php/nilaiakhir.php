<?php
    $tugas = readline("Masukan Nilai Tugas : ");
    $uts = readline("Masukan Nilai UTS : ");
    $uas = readline("Masukan Nilai UAS : ");

    $nilaiakhir = (0.3 * $tugas) + (0.3 + $uts) + (0.4 * $uas);

    if ($nilaiakhir >= 60)
        echo "Status : LULUS";
    else {
        echo "Status : TIDAK LULUS ";
    }
?>