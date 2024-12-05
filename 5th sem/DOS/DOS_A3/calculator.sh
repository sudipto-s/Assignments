case $2 in
+)
   res=`echo $1 + $3 | bc`;;
-)
   res=`echo $1 - $3 | bc`;;
x)
   res=`echo $1 \* $3 | bc`;;
/)
   res=`echo $1 / $3 | bc`;;
%)
   res=`echo $1 % $3 | bc`;;
^)
   res=`echo $1 ^ $3 | bc`;;
*)
   echo "Invalid operator"
   exit 1;;
esac
echo $1 $2 $3 = $res