echo Enter basic salary:
read a
da=`echo $a \* .4 | bc`
hra=`echo $a \* .2 | bc`
grs=`echo $da + $hra + $a | bc`
echo "Gross salary: $grs"
