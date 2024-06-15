<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        echo "Hello World";     //Hello World
    ?>

    <?php
        /* This is a multi-line comment
        which will not be interprited */    //there is no statement to display
    ?> 

    <?php
        $cnt = 1;
        $str = "Hello";
        $arr = array("One", "Two", "Three"); //there is no statement to display
    ?>

    <?php
        $username = "Fred";
        echo $username; //Fred
        echo "<br>";    //line break
        $current_user = $username;
        echo $current_user;    //Fred
    ?>

    <?php
        $oxo = array(array('x', ' ', 'e'), array('o', 'e', 'x'), array('x', 'o', ' '));
        echo $oxo[1][2];    //x
    ?>

    <?php
        $author = "Steve Ballmer";
        echo "Developers, developers, developers, developers, developers, developers
        - $author";    //Developers, developers, developers, developers, developers, developers - Steve Ballmer 
    ?>

    <?php
        // $text = "Measurning programming progress by lines of codes is like
        // $author = "Bill Gates";
        // Measuring aircraft building progress by weight.
        // - $author.";
        echo $text;     //Syntax error, unexpected identifier "Bill"
    ?>

    <?php
        $author = "Brian W. Kernighan";
        echo <<<_END
        Debugging is twice as hard as writing the code in the first place.
        Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it.
        - $author.
        _END;   //Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it. - Brian W. Kernighan.
    ?>

    <?php
        $author = "Scott Adams";
        $out = <<<_END
        Normal people believe that if it ain't broke, don't fix it.
        Engineers believe that if it ain't broke, it doesn't have enough features yet.
        - $author.
        _END;   //there is no statement to display
    ?>

    <?php
        $number = 12345 * 67890;
        echo substr($number, 3, 1);    //1
    ?>

    <?php
        $pi = 3.1415;
        $radius = 5;
        echo $pi * ($radius * $radius);    //78.5375
    ?>

    <?php
        // function longdate($timestamp) {
        //     return date("1 F jS Y", $timestamp);    //there is no statement to display
        // }
    ?>
    
    <?php
        // function longdate($timestamp) {
        //     $temp = date("1 F jS Y", $timestamp);
        //     return "The date is $timestamp";    //there is no statement to display
        // }
    ?>

    <?php
        // $temp = "The date is ";
        //echo longdate(time());     //1 September 30th 2023
        // function longdate($timestamp) {
        //     return $temp.date("1 F jS Y", $timestamp);
        // }
    ?>
    
    <?php
        // $temp = "The date is ";
        // echo $temp . longdate(time());    //The date is 1 October 1st 2023
        // function longdate($timestamp) {
        //     return $temp.date("1 F jS Y", $timestamp);
        // }
    ?>
    
    <?php
        $temp = "The date is ";
        echo longdata($temp, time());   //The date is 1 September 30th 2023
        function longdata($text, $timestamp) {
            return $text . date("1 F jS Y", $timestamp);
        }
    ?>

    <?php
        echo test();     //0
        echo "<br><br>"; //double line break
        echo test();     //1
        function test() {
            static $count = 0;
            echo $count;
            $count++;
        }
    ?>

    <?php
        static $int = 0;            //there is no statement to display
        static $int = 1+2;          //there is no statement to display
        static $int = sqrt(144);    //there is no statement to display
    ?> 
</body>
</html>

