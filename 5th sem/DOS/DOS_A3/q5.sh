echo Enter the cost price:
read cp
echo Enter the selling price:
read sp
if (( $sp > $cp ))
then
   profit=`echo $sp - $cp  | bc`
   echo Profit: $profit
elif (( $sp < $cp ))
then
   loss=`echo $cp - $sp | bc`
   echo Loss: $loss
else
   echo No profit, no loss.
fi