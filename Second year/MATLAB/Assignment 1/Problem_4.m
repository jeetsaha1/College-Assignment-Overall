% Use a formula-based function. 
%  Function: interest = calc_simple_interest(p, r, t) 
%  Script: 
% o Inputs principal, rate, time. 
% o Calls function and prints the result. 

function i = calc_simple_interest(p,r,t)
    i = (p*t*r)/100;
end

fprintf('Enter the amount of the Capital: ');
p = input('');

fprintf('Enter the time interval: ');
t = input('');

fprintf('Enter the rate of interest: ');
r = input('');

disp(calc_simple_interest(p,t,r))