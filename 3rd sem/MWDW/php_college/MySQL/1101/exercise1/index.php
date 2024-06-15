<?php
    include('./login.php');

    if(isset($_SESSION['login_user']))
        header('location:profile.php');
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Login Form in PHP with Session</title>
</head>
<body>
    <div id="main">
        <div id="login">
            <h2>Login Form</h2>
            <form action="./login.php" method="post">
                <label for="">Username: </label>
                <input type="text" name="username" placeholder="username"><br><br>
                <label for="">Password: </label>
                <input type="password" name="password" placeholder="*****"><br><br>
                <input type="submit" value="Login" name="submit">
                <span><?php echo $error; ?></span>
            </form>
        </div>
    </div>
    <a href="./signup.html"><button>Signup</button></a>
</body>
</html>
