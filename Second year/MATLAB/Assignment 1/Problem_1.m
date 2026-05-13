% Write a MATLAB script that performs the following matrix operations: 
% 1. Compute the product C=A×B 
% 2. Calculate the inverse of matrix A, if it exists

% Taking input the matrixes from the user
A = zeros(3,3)
B = zeros(3,3)

fprintf("The first matrix is: \n");
for i=1:3
    for j = 1:3
        fprintf('Enter the number: ');
        A(i,j) = input('');
    end
end


fprintf("The second matrix is: \n");
for i=1:3
    for j = 1:3
        fprintf('Enter the number: ');
        B(i,j) = input('');
    end
end

% The result is stored in this matrix
C = zeros(3,3);

for i = 1:3
    for j = 1:3
        sum = 0;
        for k =1:3
            sum = sum + A(i,k) * B(k,j);
        end
        C(i,j) = sum;
    end
end

disp(C);