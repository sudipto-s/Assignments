<?php
    // session_start();

    if(isset($_POST['signup'])) {
        if(empty($_POST['username']) || empty($_POST['password'])) {
            $error = "Username or Password is invalid!";
        } else {
            $username = $_POST['username'];
            $password = $_POST['password'];
            $conn = mysqli_connect('localhost', 'root', '', 'test1');
            $username = stripslashes($username);
            $password = stripslashes($password);
            
            $qry = mysqli_query($conn, "SELECT * FROM login WHERE username='$username'");

            if(mysqli_num_rows($qry)) {
                $error = "Username already exists!";
            } else {
                $sql = "INSERT INTO login (username, password) VALUES ('$username', '$password')";

                if (mysqli_query($conn, $sql)) {
                    $error = "Successfully created account!";
                } else {
                    echo "Error: " . $sql . "<br>" . mysqli_error($conn);
                }
            }
            header('Location:index.php');
            mysqli_close($conn);
        }
    }
?>
