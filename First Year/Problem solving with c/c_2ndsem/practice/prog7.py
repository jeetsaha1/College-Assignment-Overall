def dec_binary(num):
    if num>1:
        dec_binary(num//2)
    print(num%2,end=(''))
num=int(input("enter the number:"))
dec_binary(num)