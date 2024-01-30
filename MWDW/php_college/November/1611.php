<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">    
    <title>String Formatting</title>
</head>
<body>
    <?php
        echo "<pre>";
        //%d - decimal integer, %b - binary, %s - string, %X - hex
        //%c - character, %e - sintific notation, %o - octal

        // printf("There are %d baskets", 3);  //3
        // printf("There are %b baskets", 3);  //11
        // printf("My name is %s", "Simon");  //Simon
        // printf("<span style='color:#%X%X%X'>Hello</span>", 25, 127, 245);
        // $r = 90; $g = 90; $b = 90;
        // printf("<span style='color:#%X%X%X'>Hello</span>", $r-25, $g-127, $b-245);
        // printf("The result is: %.2f", 123.42/12);    //10.29
        // printf("My name is %s. I'm %d year's old, which is %X in decimal", "Jacob", 35, 35);
        
        // printf("The result is: $%15f\n", 123.42/12);    //10.285000
        // printf("The result is: $%015f\n", 123.42/12);   //0000010.285000
        // printf("The result is: $%15.2f\n", 123.42/12);  //10.29
        // printf("The result is: $%015.2f\n", 123.42/12); //0000000000010.29
        // printf("The result is: $%'#15.2f\n", 123.42/12);//10.29
        // printf("The result is: $%'-15.2f\n", 123.42/12);//10.29
        // printf("The result is: $%'~15.2f\n", 123.42/12);//10.29
        // printf("The result is: $%'_15.2f\n", 123.42/12);//10.29
        // printf("The result is: $%'-15.2f\n", 123.42/12);//10.29
        // printf("The result is: $%'`15.2f\n", 123.42/12);//10.29

        // $h = "Rasmus";
        // printf("[%s]\n", $h);
        // printf("[%12s]\n", $h);
        // printf("[%-12s]\n", $h);
        // printf("[%012s]\n", $h);
        // printf("[%'#12s]\n", $h);
        // $h = "Rasmus Lerdorf";
        // printf("[%12.8s]\n", $h);
        // printf("[%-12.12s]\n", $h);
        // printf("[%-'@12.10s]\n", $h);

        // $ab = sprintf("%X%X%X", 65, 127, 245);
        // echo $ab;
        // $ab = sprintf("The result is: $%.2f", 123.42 / 12);
        // echo $ab;
        // echo sprintf("%'.9d\n", 123);
        // echo sprintf("%'.09d\n", 123);

        // $num = 5;
        // $loc = "tree";
        // $format = "There are %d monkeys in the %s";
        // echo sprintf($format, $num, $loc);

        $m1 = 68.75;
        $m2 = 54.35;
        $m = $m1 + $m2;
        // echo "$m\n";
        // echo sprintf("%01.2f", $m);

        $numbers = 362525200;
        // echo sprintf("%.3e", $numbers);

        // echo time();
        echo time() + 7 * 24 * 60 * 60;

        //vprint(), vsprint(), vfprint()        
        echo "</pre>";
        ?>
</body>
</html>

