<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../style.css">
    <title>Action</title>
</head>
<body>
    <?php
        //Form 1 - 23/11
        $cmd = 'dir';   //windows
        // $cmd = 'ls';   //linux
        exec(escapeshellcmd($cmd), $output, $status);
        if($status)
            echo "Exec command failed";
        else 
            foreach($output as $line)
                echo htmlspecialchars("$line\n");

        //Form 2 - 
        // if(isset($_GET['name']))
        //     echo $_GET['name'];
    ?>
</body>
</html>

