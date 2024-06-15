<!-- * A cookie is a temporary file stored on client side & is used to identify a user.

* This files are embedded by the server on the client's computer & when the same computer requests a page with a browser,
it will send a cookie too.

* setcookie() function is used to set a cookie.

* The setcookie function must appear before the closing of html tag(</html>).

* All the values of cookies are stored in $_COOKIE[] super global array.

* Generally a cookie must not be greater than 4kb (4096 bytes).

* Internal cookies:- are set by the domain which you are surfing. internal cookies have the information of your global variables,
thats why it need not a external user permission for accessing the super global values.
f66c3b
* External Cookies:- These are stored on a domain from another domain fro better UX. These don't have idea of internal structure of the website.
Thats why everytime accessing the external cookies we need permission. These types of cookies are called "3rd party cookies".
-->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookies</title>
</head>
<body>
    <?php
        $data = "this is cookie";
        setcookie("name", $data);
        setcookie("time", time(), time() + 60 * 60 * 24 * 30);
        setcookie("country", "IN");

        print_r($_COOKIE);
    ?>
</body>
</html>
