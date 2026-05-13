% Write a matlab code to input a list of 10 numbers , store them in an array
% 1. Find the maximum and minimum value
% 2. Sort the array 

a = zeros(3,3);
for i=(1:3)
    for j = (1:3)
        n = sprintf("Enter the number[%d][%d]",i,j);
        a(i,j) = input(n);
    end
end
disp(a);

b = reshape(a,1,[]);

for i=(1:9)
    for j=(1:(9-i))
        if (b(j)>b(j+1))
            t = b(j);
            b(j) = b(j+1);
            b(j+1) = t;
        end
    end
end
disp(b);
disp(b(9));
disp(b(8));
