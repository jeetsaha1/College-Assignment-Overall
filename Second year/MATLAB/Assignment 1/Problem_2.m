% Use functions to compute area and perimeter of a Rectangle. 
% Write a script that: 
%  1.Takes relevant input from the user. 
%  2.Calls functions to compute and display area and perimeter.

fprintf("Enter the length: ");
length = input('');

fprintf("Enter the width: ");
width = input('');

disp(area(length,width));
disp(perimeter(length,width));

function res = area(length,width)
    res = length*width;
end

function res1 = perimeter(length,width)
    res1 = 2*(length+width);
end