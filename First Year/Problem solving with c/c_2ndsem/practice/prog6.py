# def non_decreasingorder(L):
#     if (len(L)==1):
#         return True
#     else:
#         return L[0]<L[1] and non_decreasingorder(L[1:])
    
# L=[int(x) for x in input ("Enter the values:").split(',')]
# if (non_decreasingorder(L)):
#     print(L,"is in non decreasing")
# else:
#     print(L,"is not in non decreasing order")

def non_decreasingorder(L):
    if len(L) <= 1:
        return True
    else:
        return L[0] <= L[1] and non_decreasingorder(L[1:])

# Taking input and checking the order
L = [int(x) for x in input("Enter the values: ").split(',')]
if non_decreasingorder(L):
    print(L, "is in non-decreasing order")
else:
    print(L, "is not in non-decreasing order")
