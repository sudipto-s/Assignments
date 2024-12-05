good_inp=0
while [ $good_inp != 1 ]
do
   echo Input a 5 digit number:
   read a
   if (( $a >= 10000 & $a <= 99999 ))
   then
      good_inp=1
   fi
done
echo Nice try
sum_digi=0
while [ $a != 0 ]
do
   rem=`expr $a % 10`
   sum_digi=`expr $rem + $sum_digi`
   a=`expr $a / 10`
done
echo Sum of digits: $sum_digi