echo "filename\tlinecount\twordcount\tcharcount"
echo "$1\t\t$(wc -w < $1)\t\t$(wc -l < $1)\t\t$(wc -c  < $1)"
