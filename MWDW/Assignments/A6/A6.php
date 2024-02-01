<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        //Q1 - Count number of lines in a text file
        function countLine() {
            $f = fopen('demo.txt', 'r') or die("Unable to read file");
            $c = 0;
            while(fgets($f))
                $c++;
            echo $c;    //5
            fclose($f);
        }
        countLine();
        
        //Q2 - Display line number(s) where a word is occured
        function lineNo($word) {
            $f = fopen('demo.txt', 'r') or die("Unable to open file");
            $c = 1;
            for(; $line = fgets($f); $c++) {
                if(stripos($line, $word))
                    echo "$c ";      //3 4
            }
            fclose($f);
        }
        lineNo("MWDW");

        //Q3 - Append a string to a existing file
        function appStr() {
            $f = fopen('demo.txt', 'a') or die("Unable to open file");
            $txt = <<<_END
            New string
            New string 2
            _END;
            fwrite($f, $txt);
            fclose($f);
        }
        appStr();

        //Q4 - Read & display contents of in file
        function disp() {
            $f = fopen('demo.txt', 'r') or die("Unable to open file");
            echo fread($f, filesize('demo.txt'));
            fclose($f);
        }
        disp();

        //Q5 - Write a string to a file
        function writeStr() {
            $f = fopen('demo.txt', 'w') or die("Unable to open file");
            $txt = "New string starts here.";
            fwrite($f, $txt);
            fclose($f);
        }
        writeStr();

        //Q6 - Rename a file
        rename('demo.txt', 'newdemo.txt');

        //Q7 - Delete a specific file from server
        unlink('newdemo.txt');
    ?>
</body>
</html>

