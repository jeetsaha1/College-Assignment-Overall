% Assignment 1  (MATLAB)

% Create a table of the employees with the attributes of name, id, age, department, salary
% Show the table
% Show Only the name whise salary is greter than 50,000
% Show the Avarage salary according to the department
% Show the maximum salary according to the department
% Add a column for bonus with 0.1% of salary

% Create a table
emp_name= {"Karan";"Riya";"Amit";"Rayan"};
emp_id = [21;34;23;56];
emp_age = [34;56;27;54];
emp_dept = ["IT";"IT";"Biotech";"Biotech"];
emp_salary = [34000;45000;56000;70000];
T = table(emp_name,emp_id,emp_age,emp_dept,emp_salary);
disp(T);

% Employees with salary > 50000
good = T.emp_salary > 50000;
T_good = T(good,:);
T_subset = T_good(:,"emp_name");
disp(T_subset);

% Average salary department-wise
sum_it = 0;
sum_bio = 0;
for i = 1:height(T)
    if T.emp_dept(i) == "IT"
        sum_it = sum_it + T.emp_salary(i);
    elseif T.emp_dept(i) == "Biotech"
        sum_bio = sum_bio + T.emp_salary(i);
    end
end
disp(sum_it / sum(T.emp_dept=="IT"));
disp(sum_bio / sum(T.emp_dept=="Biotech"));

% Maximum salary department-wise
max_it = 0;
max_bio = 0;
for i = 1:height(T)
    if T.emp_dept(i) == "IT"
        if max_it < T.emp_salary(i)
            max_it = T.emp_salary(i);
        end
    elseif T.emp_dept(i) == "Biotech"
        if max_bio < T.emp_salary(i)
            max_bio = T.emp_salary(i);
        end
    end
end
disp(max_it);
disp(max_bio);

% Add a column for bonus (10% of salary)
bonus = zeros(height(T),1);
for i = 1:height(T)
    bonus(i) = T.emp_salary(i) * 0.1/100;   % 10%
end
T.emp_bonus = bonus;

disp(T);
