l= input().split( )
s=list(l)
new =[]
for i in range (len(l)):
    if s[i] in new:
        continue
    else:
        new.append(s[i])
for j in range (len(new)):
    print(new[j],end =' ')
