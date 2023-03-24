#!/bin/sh
echo "what file should i create"
read name
touch ${name}_file.sh
echo "${name}_file.sh has been succesfully been created"
ls
