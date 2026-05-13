string = int (input("Enter the number:"))
number=1
for i in range (0, string+1):
    for j in range(1,i+1):
        print(number,end=' ')
        number+=1
    print('\n')