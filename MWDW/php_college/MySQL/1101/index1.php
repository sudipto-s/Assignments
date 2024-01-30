<!--
* Communication between statrting & ending time. Since HTTP is a stateless protocol, sessions are used to store user connection details.
* Session is a way to store information (in variables) to be used accross multiple pages.
* Unlike a cookie, the information is not stored in user's system.
* Session variables hold information about one single user & are available in all pages in one application.
* Ex:- In email application first we login the username & password among the pages, our session will remain until we click on logout.
* To start a session we use the function session_start(). This should be the first thing before any html tag.
* To store the session data, $_SESSION super global array is used.
* You can assign any key-value pair to this array & they will be available in all pages in the session.
* We use the unset function to delete a specific session variable.
* To destroy a session we use session_destroy() will delete all session data and end the session.
-->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sessions</title>
</head>
<body>
    <?php
        session_start();

        $_SESSION['name'] = "Alice";
        $_SESSION['age'] = 24;
        
        print_r($_SESSION);

        $_SESSION['age'] = 25;

        unset($_SESSION['a']);

        print_r($_SESSION);

        if(isset($_SESSION['age']))
            echo "Age is still stored!";

        session_destroy();

        if(session_status() == PHP_SESSION_NONE)
            echo "Session is expired.";
        else
            echo "Session is still active.";
    ?>
</body>
</html>
