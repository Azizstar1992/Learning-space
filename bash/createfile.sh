#!/bin/sh
echo "what file should i create"
read name
echo "file $name is being created"
touch ${name}_file
