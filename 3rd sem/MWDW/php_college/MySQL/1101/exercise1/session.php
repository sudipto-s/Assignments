<?php
    $connection = mysqli_connect("localhost", "root", "", "test1");
    session_start();
    $user_check = $_SESSION['login_user'];
    $sql = mysqli_query($connection, "Select username from login where username='$user_check'");
    $row = mysqli_fetch_assoc($sql);
    $login_session = $row['username'];
    if(!isset($login_session)) {
        mysqli_close($connection);
        header('Location: index.php');
    }
?>