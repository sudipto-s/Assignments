<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../style.css">
    <title>Document</title>
</head>
<body>
    <pre>
    <?php
        $f = 'Demo.txt';
        
        $f1 = fopen($f, 'r+');
        echo fread($f1, filesize($f));
        $txt = <<<_END
        Line 4
        Line 5

        _END;
        fwrite($f1, $txt);
        // echo fread($f1, filesize($f));
        fclose($f1);
    ?>
    </pre>
</body>
</html>

