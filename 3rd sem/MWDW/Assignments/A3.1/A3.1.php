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
        //Question 3.1 - Find square of any given number
        function sqr($n) {
            return $n ** 2;
        }
        echo sqr(12);    //144

        //Question 3.2 - Convert a given number of days to Years, Months & Days
        function convert($n) {
            $years = (int)($n / 365);
            $months = (int)(($n % 365) / 30);
            $days = ($n % 365) % 30;
            return "$years years, $months months & $days days";
        }
        echo convert(1000);    //2 years, 9 months & 0 days

        //Question 3.3 - Control flow
        function vote($n) {
            if($n > 17)
                return "Yes";
            else
                return "No";
        }
        echo vote(19);    //Yes

        //Question 3.4 - Swap two numbers
        //a. Using third variable
        function swap1($a, $b) {
            echo "Before swap - a: $a, b: $b<br>";  //Before swap, a: 5, b: 56
            $t = $a;
            $a = $b;
            $b = $t;
            echo "After swap - a: $a, b: $b";   //After swap, a: 56, b: 5
        }
        swap1(5, 56);
        
        //b. Without using third variable
        function swap2($a, $b) {
            echo "Before swap - a: $a, b: $b<br>";  //Before swap, a: 2, b: 3
            $a = $a + $b;
            $b = $a - $b;
            $a = $a - $b;
            echo "After swap - a: $a, b: $b";   //After swap, a: 3, b: 2
        }
        swap2(2, 3);
        
        //c. Using arithmetic operators (* & /)
        function swap3($a, $b) {
            echo "Before swap - a: $a, b: $b<br>";  //Before swap, a: 89, b: 14
            $a = $a * $b;
            $b = $a / $b;
            $a = $a / $b;
            echo "After swap - a: $a, b: $b";   //After swap, a: 14, b: 89
        }
        swap3(89, 14);

        //Question 3.5 - PHP code to display employee ID & salary
        function salary($id, $hrs, $amt) {
            echo "Employee ID: $id<br>";    //Empployee ID: 89558
            echo "Salary: ".$hrs * $amt;    //Salary: 22400
        }
        salary(89558, 56, 400);
    ?>
</body>
</html>