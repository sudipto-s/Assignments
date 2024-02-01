<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assignment 2</title>
</head>
<body>
    <?php
        //Question 1 - Pattern 1
        // for ($i = 1; $i < 6; $i++)
        //     for ($j = 1; $j <= $i; $j++)
        //         echo "$j\n";
        //     echo "<br>";


        // //Question 2 - Pattern 2
        // $c = 1;
        // for ($i = 1; $i < 5; $i++)
        //     for ($j = 1; $j <= $i; $j++)
        //         echo $c++."\n";
        //     echo "<br>";
        

        // //Question 3 - Factorial of a number
        // $n1 = 5; $f = 1;
        //     for (; $n1 > 0; $n1--)
        //         $f *= $n1;
        // echo $f;    //120

        // //Question 4 - Reverse a string
        // $s1 = "Hello"; $s2 = "";
        // for ($i = strlen($s1) - 1; $i >= 0; $i--)
        //     $s2 .= $s1[$i];
        // echo $s2;   //olleH


        // //Area of rectangle, square & circle
        // $l = 6.6; $b = 5.4; $s = 4.9; $r = 8; define("PI", 3.14);
        // function rec($l, $b) {
        //     echo "Area of rectangle: ".$l * $b;
        // }
        // function sq($s) {
        //     echo "Area of square: ".$s ** 2;
        // }
        // function cir($r) {
        //     echo "Area of circle: ".PI * $r ** 2;
        // }
        // rec($l, $b);    //Area of rectangle: 35.64
        // sq($s);         //Area of square: 24.01
        // cir($r);        //Area of circle: 200.96


        //Question 6 - Count the number of 1's in binary representation of a number using bitwise '&'
        // $n = 7; $c = 0;
        // for (; $n != 0 ; $n /= 2)
        //     if ($n & 1)
        //         $c++;
        // echo $c;	//3


        // //Question 7 - Print odd number within range
        // $d = 10; $e = 21;
        // for (; $d <= $e; $d++)
        //     if ($d & 1)
        //         echo $d."\n";		//11 13 15 17 19 21


        //Question 8 - Count the number of uppercase letters in a string
        // $s = "hAlLoWeEn"; $c = 0;
        // for ($i = 0; $i < strlen($s); $i++) { 
        //     if(ord($s[$i]) >= 65 AND ord($s[$i]) <= 90)
        //         $c++;
        // }
        // echo $c;    //4
        

        //Question 9 - Pattern 3
        // for ($i = 1; $i < 4; $i++) {
        //     for ($j = 2; $j >= $i; $j--)
        //         echo "&nbsp;&nbsp;&nbsp;";

        //     for ($j = 1; $j <= $i; $j++)
        //         echo "*\n";
                
        //     echo "<br>";
        // }


        // Question 10 - Implicit & Explicit conversion
        // $a = 56; $b = 12;
        // $c = $a / $b;
        // echo $c;            //4.6666667(Explicit)

        // echo (int)$c;       //4(Implicit)


        // Question 11 - Simple Interest
        // $p = 10000; $r = 3; $t = 4;
        // $si = ($p * $r * $t)/ 100;
        // echo $si;               //1200


        // Question 12 - Day of the week using switch ccase
        // $day = 5;
        // switch ($day) {
        //     case 1:
        //         echo "Its Sunday";
        //         break;
        //     case 2:
        //         echo "Its Monday";
        //         break;
        //     case 3:
        //         echo "Its Tuesday";
        //         break;
        //     case 4:
        //         echo "Its Wednesday";
        //         break;
        //     case 5:                 //Its Thursday
        //         echo "Its Thursday";
        //         break;
        //     case 6:
        //         echo "Its Friday";
        //         break;
        //     case 7:
        //         echo "Its Saturday";
        //         break;
        //     default:
        //         echo "Invalid number";
        // }


        // Question 13 - Swap two numbers
        // $a = 5; $b = 7;
        // echo "Before swap, A: $a B: $b";    //Before swap, A: 5 B: 7
        // $a = $a + $b;
        // $b = $a - $b;
        // $a = $a - $b;
        // echo "<br>After swap, A: $a B: $b"; //After swap, A: 7 B: 5


        // Question 14 - Sum of digits of a given numbers
        // $n = 251; $s = 0;
        // for (; $n > 0; $n /= 10)
        //     $s += $n % 10;
        // echo $s;                //8


        // Question 15 - Prime nuber between 1 & 50
        // $a = 2; $b = 50;
        // for (; $a < $b; $a++) {
        //     $isPrime = true;
        //     for ($i = 2; $i <= $a/2; $i++)
        //         if (!($a % $i)) {
        //             $isPrime = false;
        //             break;
        //         }
        //     if ($isPrime)
        //         echo $a."\n";   //2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
        // }
    ?>
</body>
</html>

