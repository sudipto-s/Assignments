<?php
    // Retrieve data from the POST request
    $id = $_POST['id'];
    $name = $_POST['name'];
    $age = $_POST['age'];

    // Load the XML file
    $xmlFile = 'users.xml';
    $xml = simplexml_load_file($xmlFile);

    // Find the node to update based on the user ID
    foreach ($xml->person as $pr) {
        if ($pr->id == $id) {
            $pr->name = $name;
            $pr->age = $age;

            $xml->asXML($xmlFile);
            http_response_code(200);    /* User found */

            return;
        }
    }
    http_response_code(404);    /* User not found */
