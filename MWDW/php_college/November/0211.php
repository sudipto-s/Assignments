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
        // require_once "action.php";
        // class A1 {
        //     public $n, $c;
        //     function __construct($n, $c) {
        //         $this->n = $n;
        //         $this->c = $c;
        //         echo $n." ".$c;
        //         $this->info();
        //     }
        //     protected function info() {
        //         echo "<br>Protected function working<br>";
        //     }
        //     function set($n, $c) {
        //         $this->n = $n;
        //         $this->c = $c;
        //     }
        //     function get() {
        //         echo $this->n." ".$this->c."<br>";
        //     }
        // }
        // $a = new A1(1, 2);
        // $a->get();
        // $a->set(4, 5);
        // $a->get();
        // $b = clone $a;
        // $b->get();
        // $b->set(5, 6);
        // $b->get();
        // $a->get();

        // class B1 extends A1 {
        //     function m1() {
        //         echo "Child function<br>";
        //         $this->info();
        //     }
        // }
        // $b = new B1(1, 2);
        // $b->m1();
        // $b->info(); //Error: Call to protected method A1::info() from global scope

        //Overloading is not allowed in PHP
        // final class C1 {
        //     public $name, $business_name;
        //     final function prop($business_name) {
        //         $this->business_name = $business_name;
        //         echo "Child can access property of parent $business_name <br>";
        //     }
        //     final function marry() {
        //         echo "Child have to marry Sophia<br>";
        //     }
        // }
        // class D1 extends C1 {   //Fatal error: Class D1 cannot extend final class C1
        //     function marry() {  //Error: Cannot override final method
        //         echo "D will marry Alice";
        //     }
        // }
        // $d = new C1();
        // $d->prop("export");
        // $d->marry();

        class E1 {
            public $name, $color;
            function __construct($name, $color) {
                $this->name = $name;
                $this->color = $color;
                echo "$name $color original<br>";
            }
            protected function f1() {
                echo "Inside protected f1";
            }
            final function f2($name) {
                echo "Inside final f2";
            }
        }
        class F1 extends E1 {
            function __construct($name, $color) {
                $this->name = $name;
                $this->color = $color;
                echo "$name $color - overridden constructor<br>";
            }
            protected function f1() {
                echo "Protected f1 override";
            }
        }
        // $f = new F1(1, 2);
        // $f->f1();   //Fatal error: Uncaught Error: Call to protected method F1::f1() from global scope
        // $f->f2();
    ?>
</body>
</html>