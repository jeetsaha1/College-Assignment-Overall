% Write a code using switch to display the number of the day when a number (1-7) entered

fprintf("Enter the number for finding the day: ");
n = input('');

switch(n)
    case 1
        fprintf("Monday");
    case 2
        fprintf("Tuesday");
    case 3
        fprintf("Wednesday");
    case 4
        fprintf("Thursday");
    case 5
        fprintf("Friday");
    case 6
        fprintf("Saturday");
    case 7
        fprintf("Sunday");
end