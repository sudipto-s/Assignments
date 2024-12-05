echo Enter internal marks:
read marks
echo Enter attendance percentage:
read attn
if (( $marks >= 20 & $attn >= 75 ))
then
   echo Allowed
else
   echo Not allowed
fi