<?php
// Create a database connection
$host = "localhost";
$user = "root";
$pass = "1234";
$db = "form";

$conn = mysqli_connect($host, $user, $pass, $db);

// Check connection
if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}

// Get the form data
$name = $_POST["name"];
$email = $_POST["email"];
$city = $_POST["city"];
$pincode = $_POST["pincode"];
if(isset($_POST['store'])){
// Insert the data into the database
$sql = "INSERT INTO info (name, email, city, pincode) VALUES ('$name', '$email', '$city', '$pincode')";

if (mysqli_query($conn, $sql)) {
  echo "New record created successfully";
} else {
  echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}
}
elseif (isset($_POST['show'])) {


// Write a SQL query to select data from a table
$sql = "SELECT name,email,city,pincode FROM info";

// Execute the query and store the result set
$result = mysqli_query($conn, $sql);

// Check if the result set is not empty
if (mysqli_num_rows($result) > 0) {
  // Output the data of each row as an HTML table
  echo "<table border='1'>";
  echo "<tr><th>Name</th><th>EMAIL</th><th>CITY</th><th>PINCODE</th></tr>";
  while($row = $result->fetch_assoc()) {
    echo "<tr><td>" . $row["name"] . "</td><td>" . $row["email"] . "</td><td>" . $row["city"] . "</td><td>" . $row["pincode"] . "</td></tr>";
  }
  echo "</table>";
} else {
  // No data found
  echo "0 results";
}
}




// Close the connection
mysqli_close($conn);
?>
