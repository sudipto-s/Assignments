<?php
    // Retrive data from file
    $file = "users.json";
    $fileData = json_decode((file_get_contents($file)), true);
    
    // Retrive data from user
    $data = json_decode((file_get_contents('php://input')), true);

    foreach ($fileData as &$val) {
        if ($val['id'] == $data['id']) {
            $val['name'] = $data['name'];
            $val['age'] = $data['age'];
            $val['gender'] = $data['gender'];
            $val['email'] = $data['email'];
            $val['occupation'] = $data['occupation'];
            break;
        }
    }

    // Save the JSON bask to the file
    file_put_contents($file, json_encode($fileData));

    // Send a response to the client
    header('Content-Type: application/json');
    echo json_encode(['status' => 'success']);
