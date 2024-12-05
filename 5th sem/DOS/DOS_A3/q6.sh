echo Enter the year:
read y
if (( `expr $y % 100` != 0 & `expr $y % 4` == 0 | `expr $y % 400` == 0 ))
then
   echo $y is a leap year
else
   echo $y is not a leap year
fi