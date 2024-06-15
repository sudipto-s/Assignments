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
        //Arrays
        $p1[] = "Copier";
        $p1[] = "Inkjet";
        $p1[] = "Laser";
        $p1[] = "Photo";
        // print_r($p1);
        // echo "<br>";
        // var_dump($p1);

        //Fill by index
        $p2[0] = "Copier";
        $p2[1] = "Inkjet";
        $p2[2] = "Laser";
        $p2[3] = "Photo";
        // print_r($p2);
        // echo "<br>";
        // var_dump($p2);
        // echo "<br>";
        // for($i = 0; $i < count($p2); $i++)
        //     echo "$i: ".$p2[$i]."<br>";

        //Associative arrays
        $p3["C"] = "Copier";
        $p3["L"] = "Laser";
        $p3["I"] = "Inkjet";
        $p3["P"] = "Photo";
        // print_r($p3['C']);
        // echo "<br>";
        // var_dump($p3);
        
        $p4 = array("Copier", "Inkjet", "Laser", "Photo");
        // echo "p4 element: ".$p4[2]."<br>";
        $p5 = array(
            'copier' => "Copier & Multipurpose",
            'inkjet' => "Inkjet Printer",
            'laser' => "Laser Printer",
            'photo' => "Photographic"
        );
        // echo "p5 element: ".$p5['inkjet']."<br><hr>";
        // foreach($p5 as $p)
        //     echo $p."<br>";
        
        $p6 = array("Copier", "Inkjet", "Laser", "Photo");
        $j = 0;
        // foreach ($p6 as $p)
        //     echo $j++.": $p<br>";
    ?>
</body>
</html>

