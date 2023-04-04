echo -e "give a number and i\'ll export the number +1\n"
sleep 1
read input
MYVAR=$(( $input+1 ))
echo "the exported value = $MYVAR"
export MYVAR
