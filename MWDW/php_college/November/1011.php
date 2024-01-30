<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        //New - 10/11
        //Key can't be a decimal value
        //Array & objects can't be used as key
        //Empty string or null can also be a key
        //The value associated with the latest key value
        //If we use boolean as key, true will generate 1 & false will generate 0
        //If we use float as key, it will cast to int without having fractional part
        class A {
            function __construct() {
                echo "Hi<br>";
            }
        } 
        // $a = new A();
        $st = array("Math" => 93,
                    "Physics" => 85,
                    "English" => 88,
                    "Chemistry" => 93,
                    "Computer" => 98,
                    false => 65
                );
        // echo $st['Computer'];
        // var_dump($st);
        // foreach ($st as $sub => $mark)
        //     echo "Student got $mark in $sub<br>";

        $pr = array(
            'paper' => array(
                "copier" => "Copier & Multipurpose",
                "inkjet" => "Inkjet Printer",
                "laser" => "Copier & Multipurpose",
                "photo" => "Copier & Multipurpose"
            ),
            'pen' => array(
                "ball" => "Ball Point",
                "hilite" => "Highlighter",
                "marker" => "Markers"
            ),
            'misc' => array(
                "tape" => "Sticky Tape",
                "glue" => "Adhesives",
                "clips" => "Paperclips"
            )
        );
        // echo "<pre>";
        // foreach($pr as $sec => $items)
        //     foreach($items as $key => $value)
        //         echo "$sec: $key($value)<br>";
        // echo "</pre>";

        // $num = array(
        //     array(2, 3, 4, 5),
        //     array()
        // );
        
        $prr = array(
            array(
                array(1, 2, 3, 4),
                array(5, 6, 7, 8),
                array(9, 10, 11, 12)
            ),
            array(
                array(13, 14, 15, 16),
                array(17, 18, 19, 20),
                array(21, 22, 23, 24)
            ),
            array(
                array(26, 27, 28, 29),
                array(30, 31, 32, 33),
                array(34, 35, 36, 37)
            )
        );
        // for($i = 0; $i < count($prr); $i++) {
        //     for($j = 0; $j < count($prr[$i]); $j++) {
        //         for($k = 0; $k < count($prr[$i]); $k++) {
        //             echo $prr[$i][$j][$k];
        //             echo " ";
        //         }
        //         echo "<br>";
        //     }
        //     echo "<br>";
        // }

        $prod = array(
            'name' => array(
                "n1" => "Earbuds",
                "n2" => "OPPO A12",
                "n3" => "Laptop",
                "n4" => "Milton",
                "n5" => "Nikon"
            ),
            'spprice' => array(
                "sp1" => "1200",
                "sp2" => "5500",
                "sp3" => "45000",
                "sp4" => "699",
                "sp5" => "34999"
            ),
            'cpprice' => array(
                "cp1" => "2000",
                "cp2" => "6000",
                "cp3" => "48000",
                "cp4" => "800",
                "cp5" => "35000"
            )
        );
        // var_dump($prr);
        // echo "Name\tSPPrice\tCPPrice<pre>";
        // foreach($pr as $sec => $items)
        //     foreach($items as $key => $value)
        //         echo "$sec: $key($value)<br>";
        // echo "</pre>";



        $p1[] = "Copier";
        $p1[] = "Inkjet";
        $p1[] = "Laser";
        $p1[] = "Photo";
        $p6 = [
            0 => ["name"=>"Copier","type"=>"Multipurpose"],
            1 => ["name"=>"Inkjet","type"=>"Printer"],
            2 => ["name"=>"Laser","type"=>"Printer"],
            3 => ["name"=>"Photo","type"=>"Camera"]
        ];
        // echo "<pre>";
        // print_r($p6);
        // echo "</pre>";
        // echo "<hr>";
        // //Accessing elements of an Array
        // echo "First Element: ".end($p1)."<br>"; //access last element using end() function
        // reset($p1); //reset pointer to the first element
        // echo "Second Element: ".next($p1)."<br>";   //access next element using next() function
        // prev($p1);  //access previous element using prev() function
        // echo current($p1)."<br>";   //access current element using current() function
    ?>
</body>
</html>