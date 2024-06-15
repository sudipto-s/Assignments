<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
    <?php
        $ar1 = array("Sophia" => "31", "Jacob" => "41", "William" => "39", "Ramesh" => "40");
        // var_dump($ar1);
        // echo "<br><br>";
        // asort($ar1);
        // var_dump($ar1);
        // echo "<br><br>";
        // ksort($ar1);
        // var_dump($ar1);
        // echo "<br><br>";
        // arsort($ar1);
        // var_dump($ar1);
        // echo "<br><br>";
        // krsort($ar1);
        // var_dump($ar1);

        function hurdle($hurd, $h) {
            $c = 0;
            foreach($hurd as $i)
                if($h >= $i)
                    $c++;
            return $c == count($hurd) ? "Yes" : "No";
        }
        $hurd = [1, 2, 3, 4, 5];
        // echo hurdle($hurd, 5);

        // $color = ['white', 'green', 'red'];
        // foreach($color as $c)
        //     echo "$c,";
        // echo "<ul>";
        // sort($color);
        // foreach ($color as $c)
        //     echo "<li>$c";
        
        $x = [1, 2, 3, 4, 5];
        // var_dump($x);
        // echo "<br>";
        // unset($x[3]);
        // sort($x);
        // var_dump($x);

        $color = array(4 => 'white', 6 => 'green', 11 => 'red');
        // echo current($color);

        function addUp($a1, $a2, $t) {
            foreach($a1 as $i)
                foreach($a2 as $j)
                    if($i+$j == $t)
                        return 1;
            return 0;
        }
        $a1 = [1, 2];
        $a2 = [4, 5, 6];
        // echo addUp($a1, $a2, 5);
    ?>
</body>
</html>

