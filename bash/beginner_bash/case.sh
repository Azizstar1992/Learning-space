#!/bin/bash

echo -e "please enter your name\npress end to exit program"

while :
do

	read input

	case $input in
		end)
			echo "thank you for using the case program"
			break
			;;
		*)
		echo -e "Hello $input, Welcome!\n"
	esac
done
sleep 1
echo "Take care"
