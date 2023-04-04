#!/bin/bash
echo -e "welcome to the input test script, this input will have a series of tests that i would like you to try\n"
echo -e "the first test will be that the name of the script will be printed, \$0 means the name of the script\n" 
echo -e "the name of the script is $0\n"

echo "the second test will now check if the first argument has been passed"
echo -e "to check the first parameter you use \$1 .. \$n as the value, if [ -z \$1] , that means no value has been passed\n"
if [ -z $1 ]
then 
echo -e "no value was passed\n"
else
echo -e "$1 was passed as a parameter\n"
fi

echo "now the third test will involve counting how many parameters you have inputted"
echo -e "in order to show you use, the script uses \$# to demonstrate\n"

echo -e "you have $# number of values passed as a parameter\n"

echo -e "for our 4th test we will see a list of parameters passed you using \$@ to show\n"
echo $@

