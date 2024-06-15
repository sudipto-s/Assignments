<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
    <pre>
    <?php
        $demo = 'demo.txt';
    
        // try {
        // $f = fopen($demo, 'w');
        // $txt = <<<_END
        // This is a demo text.
        // Im MWDW Student.
        // Im MWDW Student.
        // Im MWDW Student.
        // Im MWDW Student.
        // _END;
        // fwrite($f, $txt);
        // fclose($f);
        //     $c = 0;
        //     $f = fopen($demo, 'r');
        //     while(fgets($f))
        //         $c++;
        //     fclose($f);
        //     echo $c;
        // } catch (Exception $e) {
        //     echo 'Caught exception: ',  $e->getMessage(), "\n";
        // }

        //LOCK_SH - SHARED(readable only), LOCK_EX - EXCLUSIVE(write lock), LOCK_UN - UNLOCK, LOCK_NB - DON'T BLOCK OTHER USERS(read only)
        // $f2 = fopen($demo, 'r+');
        // $txt = fgets($f2);
        // if(flock($f2, LOCK_EX)) {
        //     fseek($f2, 0, SEEK_END);
        //     fwrite($f2, $txt);
        //     flock($f2, LOCK_UN);
        // }
        // fclose($f2);
        // readfile($demo);

        // echo file_get_contents('https://google.com');

        //Form 1
        echo <<<_END
        <html><head><title>PHP Form Upload</title></head><body>
        <form method='post' action="upload.php" enctype='multipart/form-data'>
            Select File: <input type="file" name='filename' size='10'>
            <input type="submit" value="upload">
        </form>
        _END;
        if($_FILES) {
            $name = $_FILES['filename']['name'];
            move_uploaded_file($_FILES['filename']['tmp_name'], $name);
            echo "Uploaded image '$name'<br><img src='$name'>";
        }
        echo "</body></html>";
    ?>
    </pre>
</body>
</html>

