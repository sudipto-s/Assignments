<?php
    // Retrive data from file
    $file = "users.json";
    $fileData = json_decode((file_get_contents($file)), true);
    
    // Retrive data from user
    $data = json_decode((file_get_contents('php://input')), true);

    $found = false;

    foreach ($fileData as &$val) {
        if ($val['id'] == $data['id']) {
            $val['name'] = $data['name'];
            $val['age'] = $data['age'];
            $val['email'] = $data['email'];
            $found = true;
            break;
        }
    }

    // Save the JSON bask to the file
    file_put_contents($file, json_encode($fileData));

    if ($found) http_response_code(200);
    else http_response_code(404);

    // Send a response to the client
    header('Content-Type: application/json');
