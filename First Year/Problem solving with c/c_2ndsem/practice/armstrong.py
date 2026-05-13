# # def no_dig(num):
# #     s=0
# #     while num>0:
# #         r=num%10
# #         s+=1
# #         num=num//10
# #     return s
# # def armstrong(num):
# #     sum=0
# #     x=no_dig(num)
# #     print(x)
# #     while num>0:
# #         w=num%10
# #         sum= sum+ w**x
# #         num=num//10
# #     return sum
# # num=int(input("Enter the number:"))
# # num1=armstrong(num)
# # print(num1)
# # if num == num1:
# #     print("armstrong")
# # else:
# #     print("Not armstrong")




# def fibonacci(n):
#     a=0
#     b=1
#     while n!=0:
#         t=b
#         b+=a
#         print(a)
#         a=t
#         n-=1
        
# fibonacci(21)

d1 = {'a': 1, 'b': 2}
d2 = {'c': 3, 'd': 4}
d1.update(d2)
print(d1)  # Output: {'a': 1, 'b': 2, 'c': 3, 'd': 4}
