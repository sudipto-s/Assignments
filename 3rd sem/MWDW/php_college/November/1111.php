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
        $a = [1, true];
        $ar = array(1, 2, true, false);
        echo is_array($a) ? "Yes" : "No";
        echo "<br>Count: ".count($a)."<br>";
        shuffle($ar);
        var_dump($ar);
        echo "<br>";
        $t1 = explode(' ', 'It is what it is');
        echo implode($t1)."<br>";
        $t2 = explode('***', 'It***is***what***it***is');
        print implode($t2)."<br>";

        $a = "Original";
        $ar = array("a" => 'cat', "b" => "dog", "c" => "horse");
        extract($ar);
        echo "\$a = $a; \$b = $b; \$c = $c <br>";

        $fname = "Doctor";
        $sname = "Who";
        $planet = "Gallifrey";
        $system = "Gridlock";
        $constellation = "Kasterborous";
        print_r( compact('fname', 'sname', 'planet', 'system', 'constellation') );
        echo "<br>";
    
        $j = 23;
        $temp = "Hello";
        $address = "1 old street";
        $age = 61;
        print_r( compact( explode(' ', 'j temp address age')));
        echo '<br>';


        class A {
            private $a;
            function __construct() {
                $this->a = [72, 65, 80, 80, 68, 73, 87, 65, 76, 73, 84, 79, 65, 76, 76];
            }
            function message(){
                echo implode(' ', array_map('chr', $this->a));
            }
        }
        $b = new A();
        $b->message();

        //reset, end
    ?>
</body>
</html>

