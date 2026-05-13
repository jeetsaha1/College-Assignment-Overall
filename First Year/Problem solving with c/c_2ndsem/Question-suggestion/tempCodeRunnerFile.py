def sort(list1):
    for i in range(len(list1)):
        for j in range(i+1,len(list1)):
            if(list1[i]>list1[j]):
                list1[i],list1[j]==list1[j],list1[i]
    return list1
str1=list(map(int,input("Enter the numbers: ").split()))
str2=list(map(int,input("Enter the numbers: ").split()))
str11=sort(str1)
str22=sort(str2)
new=str11+str22
print(new)