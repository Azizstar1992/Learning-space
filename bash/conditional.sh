#!/bin/bash

#reading in a number
echo "put a number down"
read input


if [ $input -eq 2 ]; then
echo "its equal to 2"
elif [ $input -gt 3 ];
then
echo "its greater than 2"
else
echo "its less than 2"
fi
