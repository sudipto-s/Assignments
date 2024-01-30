<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SQL Injection</title>
</head>
<body>
    <?php
        //REGEX
        // $fields = array('name' => array('filter'=> FILTER_SANITIZE_STRING,
        //                                 'validate'=> FILTER_VALIDATE_REGEXP,
        //                                 'options'=> array('regexp'=> '/^[A-Za-z\S]+$/')));
        
        //PDO
        // $dsn = "mysql:host=localhost;
        //         dbname=myDB;
        //         charset=UTF8";
        // $pdo = new PDO($dsn,'username','password');
        // $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        // if($pdo) {
        //     echo "Connected to database!";
        // }

        $conn = new PDO("mysql:dbname=test1;host=127.0.0.1;charset=utf8",'root','');
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        // $userID = $_POST['userId'];
        // $pass = $_POST['password'];
        $userID = 'sudipto';
        $password = '123';
        $qry = $conn->prepare("SELECT * FROM login where username=:username or password=:password");
        $qry->bindParam(':username', $userID);
        $qry->bindParam(':password', $pass);
        $qry->execute();
        $res = $qry->fetch(PDO::FETCH_ASSOC);
        
        if($res)
            print_r($res);
        else
            echo "0 result!";
    ?>
</body>
</html>
