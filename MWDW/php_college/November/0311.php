<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js'></script>
    <title>Document</title>
</head>
<body>
    <?php
        //Absatract class
        abstract class A {
            function msgA() {
                echo "This is parent <br>";
            }
            abstract function profession($name, $type);
            abstract function property();
        }
        class B extends A {
            function msgB() {
                echo "This is a child class <br>";
            }
            function profession($name, $type="sport") {
                echo "Name of profession is $name<br>The profession is of type $type <br>";
            }
            function property() {
                echo "Child is allowed to access parent property <br>";
            }
        }
        // $b = new B();
        // $b->msgA();
        // $b->profession("cricketer");
        // $b->property();
        // $b->msgB();

        //Interface
        interface intf1 {
            function branch();
            function subject();
            function activity();
        }
        class C implements intf1 {
            function branch() {
                echo "Bachelor of Physical Education <br>";
            }
            function subject() {
                echo "Subjects are Physics, Mathematics <br>";
            }
            function activity() {
                echo "Sing & dance <br>";
            }
        }
        // $c = new C();
        // $c->branch();
        // $c->subject();
        // $c->activity();

        class D {
            static function msg() {
                echo "Welcome to the future";
            }
        }
        // $d = new D();
        // $d->msg();
    ?>
</body>
</html>

