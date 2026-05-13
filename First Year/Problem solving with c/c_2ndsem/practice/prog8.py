def power(n,p):
    num=n
    for i in range (2,p+1):
        num =num*n
    return num
num= int(input("enter the number:"))
num2= int(input("enter the power:"))
print("Result",power(num,num2))