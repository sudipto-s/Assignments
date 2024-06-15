<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $u1 = "u1"; $p1 = "123";
        if(isset($_POST['submit'])) {
            $username = $_POST['username'];
            $password = $_POST['password'];
            
            if ($username === $u1 && $password === $p1) {
                setcookie('username', $username, time() + 60 * 60 * 24, '/');
                header('Location:check.php');
            } else {
                echo "username/password invalid!";
            }
        }
    ?>
</body>
</html>
