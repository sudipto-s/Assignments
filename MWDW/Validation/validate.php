<?php
$name = $_POST['name'];
$username = $_POST['username'];
$email = $_POST['email'];
$password = $_POST['password'];

echo $username;

// if (empty($name) || empty($username) || empty($email) || empty($password))
//     echo "All fields are required!";
// else {
    // Username
    if (preg_match("/^[a-zA-Z]\s\*[0-9._]+$/", $username))
        echo "Invalid username!";

    // Email
    // if (!filter_var($email, FILTER_VALIDATE_EMAIL))
    //     echo "Invalid email!";

    // // Password 
    // if (strlen($password) >= 5) {
    //     if (!preg_match("/[a-zA-Z0-9._]+/", $password))
    //         echo "Invalid password!";
    // } else
    //     echo "Password length should be greater than 4";
// }
