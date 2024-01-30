<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        // $f1 = fopen('demo.txt', 'w') or die("Failed to open");
        // $txt = <<<_END
        // LINE 1
        // LINE 2
        // LINE 3
        // _END;
        // fwrite($f1, $txt) or die("Failed to write");
        // fwrite($f1, $txt) or die("Failed to write");
        // fwrite($f1, $txt) or die("Failed to write");
        // fclose($f1);
        
        // $f2 = fopen('demo.txt', 'w') or die("Failed to open");
        // $txt = <<<_END
        // LINE 4
        // LINE 5
        // LINE 6
        // _END;
        // fwrite($f2, $txt) or die("Failed to write");
        // fwrite($f2, $txt) or die("Failed to write");
        // fwrite($f2, $txt) or die("Failed to write");
        // fclose($f2);
        
        // $f3 = fopen('demo.txt', 'r') or die("Failed to open");
        // echo fread($f3, filesize('demo.txt'));
        // fclose($f3);
        
        // $f4 = fopen('demo.txt', 'r') or die("Failed to open");
        // $line = fgets($f4);
        // fclose($f4);
        // echo $line;

        // $f5 = fopen('demo.txt', 'r') or die("Failed to open");
        // while($a = fgets($f5))
        //     echo $a;
        // fclose($f5);
        
        // $f6 = fopen('demo.txt', 'r') or die("Failed to open");
        // $a= fgetc($f6);
        // echo $a;
        // fclose($f6);
        
        $f7 = fopen('demo.txt', 'r') or die("Failed to open");
        while($a = fgetc($f7)) {
            echo $a;
            if($a == '!')
                break;
        }
        fclose($f7);
        

        //Die -
            //It is used to throw the exception.
            //It is used to print the message after experiencing an error
            //It is taken from 'Perl'
        //Exit -
            //It is used to exit from the prosess
            //It is generally used to exit from the script(terminates the script)
            //It is take from 'C'
    ?>
</body>
</html>

