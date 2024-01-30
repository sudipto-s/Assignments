<?php
    include("session.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./style.css">
    <title>Your Home Page</title>
</head>
<body>
    <div id="profile">
        <b id="welcome">Welcome: <i><?php echo $login_session;?></i></b>
        <b id="logout"><a href="./logout.php">Log Out</a></b>
    </div>
</body>
</html>
