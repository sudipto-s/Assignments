<?php
    // Retrieve data from the POST request
    $id = $_POST['id'];
    $name = $_POST['name'];
    $age = $_POST['age'];

    // Load the XML file
    $xmlFile = 'users.xml';
    $xml = simplexml_load_file($xmlFile);

    // Find the node to update based on the car name
    $targetNode = null;
    foreach ($xml->person as $pr) {
        print_r($pr); echo '<br>';
        if ($pr->id == $id) {
            $targetNode = $pr;
            break;
        }
    }

    // If the node is found, update its price
    if ($targetNode !== null) {
        $targetNode->name = $name;
        $targetNode->age = $age;

        // Save the changes back to the XML file
        $xml->asXML($xmlFile);
        http_response_code(200); // Success
    } else {
        http_response_code(404); // Not Found
    }
