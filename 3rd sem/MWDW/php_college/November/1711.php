<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Date time & File handling</title>
</head>
<body>
    <?php
        // echo time();
        // echo time() + 7 * 24 * 60 * 60;

        // echo mktime(0, 0, 0, 12, 1, 2022);  //1669849200

        // echo date('l F jS, Y - g:iA', time());

        // $m = 9; $d = 30; $y = 1960;
        // if(checkdate($m, $d, $y))
        //     echo 'Date is valid';
        // else
        //     echo 'Date is invalid';

        //FILE HANDLING
        //Types - .txt, .WAV, .bitmap
        //Modes of opening - r - read only, w - write, a - append, x - , r+ - , w+ - , a+ - , x+ - 
        // if((file_exists('demo.txt')))
        //     echo "Exists";

        // $fi = fopen("demo.txt",'w') or die("Failed to access file");
        // $txt = <<<_END
        // I'm MWDW topper.
        // _END;
        // fwrite($fi, $txt) or die("Failed to write");

        // $ft = fopen("demo.txt",'r') or die("Failed to access file");
        // $st = fread($ft, filesize('demo.txt')) or die("Failed to read");
        // echo $st;

        // readfile('demo.txt') or die();
        // readfile('Demo/456.jpeg');
        // readfile('demo.html');

        // $fh = fopen('Demo/demo.txt', 'r') or die('Failed to open');
        // echo fread($fh, filesize('Demo/demo.txt'));
    ?>
</body>
</html>

