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
        //Do stack trace
        // function A($n) {
        //     if ($n <= 1)
        //         return;
        //     else {
        //         A($n - 2);
        //         echo $n;
        //     }
        //     A($n - 1);
        //     echo $n - 2;
        // }
        // A(5);

        //Objects has its own existance
        //Class doesn't reqiures objects
        //Access specifiers - Public, Private & Protected
        //this defines current object of a class
        class JoeRoot {
            public $name;
            public $profession;
            function set_name($name) {
                $this->$name = $name;
                echo "<b>Name</b>: $name";
            }
            function set_profession($profession) {
                $this->$profession = $profession;
                echo " <b>Profession</b>: $profession";
            }
        }
        $j = new JoeRoot();
        $j->set_name("Joe Root");
        $j->set_profession("Cricketer");

        
    ?>
</body>
</html>

