<?php
    session_start();

    $error = '';
    if(isset($_POST['submit'])) {
        if(empty($_POST['username']) || empty($_POST['password'])) {
            $error = "Username or Password is invalid!";
        } else {
            $username = $_POST['username'];
            $password = $_POST['password'];
            $conn = mysqli_connect('localhost', 'root', '', 'test1');
            $username = stripslashes($username);
            $password = stripslashes($password);
            
            $qry = mysqli_query($conn, "SELECT * FROM login WHERE password='$password' and username='$username'");

            if(mysqli_num_rows($qry)) {
                $_SESSION['login_user'] = $username;
                header('Location:profile.php');
            } else {
                $error = "Username or Password is invalid!";
            }
            mysqli_close($conn);
        }
    }
?>
