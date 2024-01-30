<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
    <!-- 1. HTTP
    HTML

    2. 

    <?php
        //7
        // $x = 4; $y = 4; $z = 4;
        // if (($x == $y) == $z)
        //     print('Hello');
        // else
        //     print('Hi');

        // //8
        // $a = 5; $b = -7; $c = 0; $d;
        // $d = ++$a and ++$b or ++$c;
        // echo $a, $b, $c, $d;
    ?>

    9. Different types of arrays
        a. Indexed array - array(1, 2, 3, "k, "l")
        b. Associative array - array(1 => "one", 2 => "two", 3 => "three", "k" => 12, "l" => 54)
        c. Multidiamentional array - array( array(1, 2), array(9, 5) )

    10. public - accessable outside -->
    
    <?php
        $demo = 'Demo.txt';

        function findWord($word) {
            global $demo;
            $f = fopen($demo, 'a+');
            $c = 0;
            while($a = fgets($f)) {
                $c++;
                foreach(explode(' ', $a) as $val)
                    if($word === $val) {
                        echo "The word '$word' found at line: $c";
                        return;
                    }
            }
            echo "Not found";
            fclose($f);
        }
        findWord('MWDW');
    ?>
</body>
</html>

