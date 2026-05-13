% Check whether a number is even or odd. 
%  Script: 
% o Asks user for a number. 
% o Check and display result.

fprintf('Enter the number: ');
num = input('');

if mod(num,2) == 0
    fprintf('%d is even',num);
else
    fprintf('%d is odd',num);
end