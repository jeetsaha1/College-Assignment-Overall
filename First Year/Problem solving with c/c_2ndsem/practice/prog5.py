def product (n1,n2):
    if n2<n1:
        return product(n2,n1)
    elif n2!=0:
        return(n1+product(n1,n2-1))
    else:
        return 0
print("Result=",product(12,3))
