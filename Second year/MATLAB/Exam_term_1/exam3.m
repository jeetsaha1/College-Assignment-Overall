% Write a code to generate a Pascal Traiangle

n = input("Enter the no. of lines:");
for i =1:n
    for j = 1:n-i
        fprintf(" ");
    end
    num = 1;
    for k =1:i
        fprintf("%d ",num);
        num  = num *(i-k)/k;
    end
    fprintf("\n");
end
