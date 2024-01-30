<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
    <!-- fff0e5 -->
    <?php
        $servername="localhost";
        $username = "root";  //replace with your username
        $password = "";   //replace with your password
        $dbname="myDB";
        // Create connection
        $conn= new mysqli($servername, $username, $password, $dbname);
        if ($conn->connect_error) { 
            die("Connection failed: " . $conn->connect_error);
        }

        $name = $_POST['name'];
        $email = $_POST['email'];
        $city = $_POST['city'];
        $pincode = $_POST['pincode'];

        if (isset($_POST['store'])) {
            $sql="INSERT INTO info VALUES ('$name','$email','$city','$pincode');";
            $res=$conn->query($sql);
            echo "Data Inserted Successfully";
        }
        if (isset($_POST['show'])) {
            $sql = "SELECT * FROM info;";
            $res = $conn->query($sql);
            if($res -> num_rows > 0) {
                echo "<table border=1>";
                echo "<tr><th>Name</th><th>Email </th> <th> City </th> <th> Pincode</th> </tr>";
                while($row = $res->fetch_assoc()) {
                    echo "<tr><td>".$row['Name']."</td>";
                    echo "<td> ".$row['Email']."</td>";
                    echo "<td>".$row['City']."</td>";
                    echo "<td>".$row['Pincode']."</td></tr>";
                }
                echo "</table>";
            } elseif ($res -> num_rows === 0) {
                echo "No data found. Table is empty!";
            }
            else {
                echo "Error: ".$sql."<br>".$conn -> error;
            }
        }
        $conn->close();
    ?>
</body>
</html>