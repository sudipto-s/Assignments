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
        //Q1 - Display
        $color = ['white', 'green', 'red'];
        foreach($color as $c)
            echo "$c,";
        echo "<ul>";
        sort($color);
        foreach ($color as $c)
            echo "<li>$c";
        echo "</ul>";

        //Q2 - Delete & sort array
        $x = [1, 2, 3, 4, 5];
        var_dump($x);   //array(5) { [0]=> int(1) [1]=> int(2) [2]=> int(3) [3]=> int(4) [4]=> int(5) }
        unset($x[3]);
        sort($x);
        var_dump($x);   //array(4) { [0]=> int(1) [1]=> int(2) [2]=> int(3) [3]=> int(5) }

        //Q3 - Print first element of the array
        $color = array(4 => 'white', 6 => 'green', 11 => 'red');
        echo pos($color);  //white

        //Q4 - Calculate & display average, five lowest & five highest temperrature
        $temp = [78, 60, 62, 68, 71, 68, 73, 85, 66, 64, 76, 63, 75, 76, 73, 68, 62, 73, 72, 65, 74, 62, 62, 65, 64, 68, 73, 75, 79, 73];
        function addUp($temp) {
            $s = 0;
            foreach($temp as $i)
                $s += $i;
            echo "Average temperature: ".$s / count($temp); //Average temperature: 69.766666666667
            echo "<br>";
            $temp = array_unique($temp);
            sort($temp);
            for($i = 0; $i < 5;)
                echo $temp[$i++].", ";      //60, 62, 63, 64, 65,
            echo "<br>";
            rsort($temp);
            for($i = 4; $i >= 0;)
                echo $temp[$i--].", ";      //75, 76, 78, 79, 85,
        }
        addUp($temp);

        //Q5 - Merge (by index) two arrays
        $a1 = array( array(77, 87), array(23, 45) );
        $a2 = array("w3resourse", "com");
        print_r(array_merge($a1, $a2));  //Array ( [0] => Array ( [0] => 77 [1] => 87 ) [1] => Array ( [0] => 23 [1] => 45 ) [2] => w3resourse [3] => com )
    
        //Q6 - Print largest key in an array
        $a1 = array(1 => 'one', 2 => 'two', 'c' => 'three');
        echo max(array_keys($a1));  //c

        //Q7 - Shortest/Longest string length
        $chrs = array("abcd", "abc", "de", "hjjj", "g", "wer");
        $lens = array_map('strlen', $chrs);
        echo "Shortest string length: ".min($lens);     //Shortest string lenght: 1
        echo "Longest string length: ".max($lens);      //Longest string length: 4

        //Q8 - Change case of values
        $arr = array('A' => "Blue", 'B' => "Green", 'C' => "Red");
        //change case of values
        print_r(array_map('strtolower', $arr));     //Array ( [A] => blue [B] => green [C] => red )
        print_r(array_map('strtoupper', $arr));     //Array ( [A] => BLUE [B] => GREEN [C] => RED )
    ?>
</body>
</html>

