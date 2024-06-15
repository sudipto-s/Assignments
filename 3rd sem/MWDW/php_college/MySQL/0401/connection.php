<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../style.css">
    <title>Document</title>
</head>
<body>
    <?php
        //Define the database
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "myDB";

        // //Connect
        // $conn = new mysqli($servername, $username, $password, $dbname);
        // if($conn -> connect_error) {
        //     die("Connection failed: ".$conn->connect_error);
        // }

        // //Query
        // $create = "CREATE TABLE student(name varchar(128), lastname varchar(128), email text);";
        // // $insert = "INSERT INTO student(name, lastname, email) values ('Tom','Mikey','tommk@gmail.com'),('Jerry','Momo','jerrymomo@gmail.com'),('Aaditya','Tiwari','aadi@tiwari.com'),('Jacob','Thomas','jacob@gmail.com')";
        // if($conn -> query($create)) {
        //     echo "Data inserted successfully.";
        // } else {
        //     echo "Error: ".$qry."<br>".$conn -> error;
        // }


        //Procedeural - Connection
        $conn = mysqli_connect($servername, $username, $password, $dbname);
        if(!$conn) {
            die("Could not connect to MySQL server.");
        } else {
            echo "Connected to MySQL server.<br><br>";
        }

        //Query
        $query = 'SELECT * FROM student';
        $result = mysqli_query($conn, $query);
        while ($row = mysqli_fetch_assoc($result)) {
            echo "Name: ".$row['name']."<br>";
            echo "Lastname: ".$row['lastname']."<br>";
            echo "Email: ".$row['email']."<br><br>";
        }
        
        $conn->close();
    ?>
</body>
</html>

