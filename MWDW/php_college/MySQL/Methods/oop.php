<?php
  // Define database parameters
  $servername = "localhost";
  $username = "root";
  $password = "1234";
  $dbname = "myDB";

  // Create a connection object using MySQLi
  $conn = new mysqli($servername, $username, $password, $dbname);

  // Check if the connection is successful
  if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
  }

  // Write a SQL query to select data from a table
  $sql = "SELECT name, lastname, email FROM Students";

  // Execute the query and store the result set
  $result = $conn->query($sql);

  // Check if the result set is not empty
  if ($result->num_rows > 0) {
    // Output the data of each row as an HTML table
    echo "<table border='1'>";
    echo "<tr><th>Name</th><th>LastName</th><th>Email</th></tr>";
    while($row = $result->fetch_assoc()) {
      echo "<tr><td>" . $row["name"] . "</td><td>" . $row["lastname"] . "</td><td>" . $row["email"] . "</td></tr>";
    }
    echo "</table>";
  } else {
    // No data found
    echo "0 results";
  }

  // Close the connection
  $conn->close();
?>
