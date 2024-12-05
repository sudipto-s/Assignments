echo Enter the first number:
read a
echo Enter the second number:
read b
echo $a + $b | bc
sum=`echo $a + $b | bc`
echo Sum: $sum
echo Sum: `echo $a + $b | bc`
diff=`echo $a - $b | bc`
echo Difference: $diff
prod=`echo $a \* $b | bc`
echo Product: $prod
quo=`echo $a / $b | bc`
echo Quotient: $quo
rem=`echo $a % $b | bc`
echo Remainder: $rem
