n=$1
sum=0
for ((i=0; i<$n; i++)); do
  if [ $((i%3)) -eq 0 ] || [ $((i%5)) -eq 0 ]; then
    sum=$((sum+i));
  fi
done

echo $sum
