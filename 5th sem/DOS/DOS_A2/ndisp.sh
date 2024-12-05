echo "Filename: $1"
echo "First $1 lines:"
head -$1 $3
echo "Last $2 lines:"
tail -$2 $3
