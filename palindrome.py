n=input()

rev=""
for i in range(len(n)-1, -1, -1):
  rev += n[i]
if(rev==n):
  print("The given string is a palindrome")
else: 
  print("The given string is not a palindrome")
