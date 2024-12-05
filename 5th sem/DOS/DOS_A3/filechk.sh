if cmp -s "$1" "$2"
then
   echo "Both files are identical"
   rm $2
   echo "Deleted $2"
else
   echo "Files are not identical"
fi