echo Enter day of the week:
read day

case $day in
"Monday")
   echo "Class at 10 AM in C111";;
"Tuesday")
   echo "Class at 5 PM in C111";;
"Wednesday")
   echo "Class at 3 PM in C111";;
"Thursday")
   echo "Lab at 11 AM in C230";;
"Friday")
   echo "No DPOS class on $day";;
"Saturday")
   echo "No DPOS class on $day";;
"Sunday")
   echo "Weekend";;
*)
   echo "Invalid day of the week";;
esac