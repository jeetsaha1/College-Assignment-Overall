% Generate Armstrong number

fprintf("Enter the number: ")
num = input('');
temp = num;
demo = num;
power = 0;
while temp ~= 0
    power = power +1;
    temp = floor(temp/10);
end
sum = 0;
while num ~= 0
    r = mod(num,10);
    sum = sum + r^power;
    num = floor(num / 10);
end

if demo == sum
    fprintf("The number is armstrong.");
else
    fprintf("The number is not armstrong.");
end