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
        $servername = "localhost";
        $username = "root";
        $password = "";
        $dbname = "myDB";

        $conn = new mysqli($servername, $username, $password, $dbname);
        if($conn -> connect_error) {
            die("Connection failed: ".$conn->connect_error);
        }

        
        $qry = 'SELECT * FROM student';
        $res = $conn->query($qry);
        if($res->num_rows > 0) {
            echo "<table border=1>";
            echo "<tr><th>Name</th><th>Lastname</th><th>Email</th></tr>";
            while ($row = $res->fetch_assoc()) {
                echo "<tr><td>".$row['name']."</td>";
                echo "<td>".$row['lastname']."</td>";
                echo "<td>".$row['email']."</td></tr>";
            }
            echo "</table>";
        } else {
            echo "No data in database";
            echo "Error: ".$qry."<br>".$conn -> error;
        }

        $conn->close();
    ?>
</body>
</html>

