def rev(s):
  rev=""
  for i in range(len(s)-1, -1, -1):
    rev = rev + s[i]
  return rev


s=input()
print(rev(s))
