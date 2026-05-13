string= input("emter the integres:").split()
list1= list(string)
new= []
for i in range (len(list1)-1,-1,-1):
    new.append(list1[i])
for j in range(len(list1)):
    if j%2==0:
        print(list[j],end=" ")
    else:
        sum= int(list1[j]+new[j])
    print(sum,end= ' ')