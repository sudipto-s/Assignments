echo Enter a character:
read chr

case $chr in
[a-z])
   echo Lower case;;
[A-Z])
   echo Upper case;;
[0-9])
   echo Digit;;
[?,+,#,$,\!])
   echo Special character;;
?*)
   echo More than one character;;
*)
   echo Invalid input;;
esac