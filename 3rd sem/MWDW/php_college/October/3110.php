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
        class User {
            public $name, $password;
            function saveUser() {
                echo "Name: ".$this->name."<br>";
                echo "Password: ".$this->password."<br>";
            }
        }
        // $obj = new User();
        // print_r($obj);
        // echo "<br>";
        // $obj->name = "Joe";
        // $obj->password = "mypass";
        // $obj->saveUser();
        // print_r($obj); echo "<br>";
        // var_dump($obj instanceof User);

        class Constructors {
            public $name, $age;
            function __construct($name, $age) {
                $this->name = $name;
                $this->age = $age;
            }
            function show() {
                echo "Name: $this->name <br>";
                echo "Age: $this->age <br>";
            }
        }
        // $cns = new Constructors("Sudipto", 20);
        // var_dump($cns);
        // echo "<br>";
        // $cns->show();

        class Destructors {
            public $name;
            function __construct($name) {
                echo "In constructor...<br>";
                $this->name = $name;
            }
            function __destruct() {
                echo "Destroying ".$this->name;
            }
        }
        // $usr = new Destructors("Bubble");
        // $usr = NULL;

        class Fruit {
            public $name, $color;
            function setName($name) {
                $this->name = $name;
                echo $name;
                $this->setColor("yellow");
            }
            private function setColor($color) {
                $this->color = $color;
                echo $color;
            }
        }
        // $mgo = new Fruit();
        // $mgo->setName("Mango");

        // class A {
        //     public $a;
        //     private $b;
        //     protected $c;
        // }
        // $a1 = new A();
        // $a1->a = "Hello";
        // $a1->b = "Hello";   //Error: Cannot access private property A::$b
        // $a1->c = "Hello";   //Error: Cannot access protected property A::$c

        class A {
            public $a;
            protected $b;
            function msg($a) {
                $this->a = $a;
            }
            protected function disp() {
                echo "Inheritance ".$this->a;
            }
        }
        class B extends A {
            function b1() {
                $this->disp();
            }
        }
        // $b1 = new B();
        // $b1->msg("hello");
        // $b1->b1();
    ?>
</body>
</html>

