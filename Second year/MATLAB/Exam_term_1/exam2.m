% Write a code program to input an array of 10 numbers and find 
% 1. Sum of all even numbers
% 2. Product of all odd numbers

n=10;
a = zeros(n,[]);
for i = 1:n
    val = sprintf("Enter the number: ");
    a(i) = input(val);
end
even = 0;
odd =1;
for j = 1:n
    if mod(j,2) == 0
        even = even+a(j);
    else
        odd = odd * a(j);
    end
end
disp(even);
disp(odd);