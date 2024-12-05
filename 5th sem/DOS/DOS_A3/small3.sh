if (( $1 <= $2 & $1 <= $3 ))
then
   echo $1 is smallest
elif (( $2 <= $1 & $2 <= $3 ))
then
   echo $2 is smallest
else
   echo $3 is smallest
fi