% a = randi(100,1);
% if(a>=90)
%     fprintf("Grade O");
% elseif(a<=89 && a >=80)
%     fprintf("Grade E");
% elseif(a<=79 && a >=70)
%     fprintf("Grade A");
% elseif(a<=69 && a >=60)
%     fprintf("Grade B");
% elseif(a<=59 && a >=50)
%     fprintf("Grade C");
% elseif(a<=49 && a >=40)
%     fprintf("Grade D");
% elseif(a<40)
%     fprintf("Fail");
% end

% n = input("Enter the number: ",'s');
% switch n
%     case {'a','A'}
%         disp('Apple');
%     case {'b','B'} 
%         disp('Ball');
% 
%     case '1'
%         disp('one');
% 
%     case '2' 
%         disp('two');
%     case '3' 
%         disp('three');
%     otherwise
%         disp('other value');
% 
% end
% 

% for i=1:4:50
%     disp(i);
% end

% for i=[7 4 3 9 11]
%     disp(i);
% end
% n=5;
% for i = 1:n
%     for j =1:n-i
%         fprintf("  ");
%     end
%     for j =1:i
%         fprintf("* ");
%     end
%     fprintf("\n");
% end



% Write a matlab script to create a csv file of weekly rainfall. Read the
% data from the csv file and plot the graph. Mention the maximum rainfall
% in the graph

% Write a MATLAB script to create a CSV file of weekly rainfall.
% Read the data from the CSV file and plot the graph.
% Mention the maximum rainfall in the graph.

% Step 1: Create sample rainfall data
weeks = 1:7;  % Week numbers
rainfall = [15, 22, 30, 10, 45, 25, 35];  % Rainfall in mm

% Step 2: Create a table and save as CSV
T = table(weeks', rainfall', 'VariableNames', {'Week', 'Rainfall'});
writetable(T, 'weekly_rainfall.csv');

% Step 3: Read data from the CSV file
data = readtable('weekly_rainfall.csv');

% Step 4: Plot the graph
figure;
plot(data.Week, data.Rainfall, '-o', 'LineWidth', 2);
xlabel('Week Number');
ylabel('Rainfall (mm)');
title('Weekly Rainfall Data');
grid on;

% Step 5: Find the maximum rainfall
[maxRain, idx] = max(data.Rainfall);
maxWeek = data.Week(idx);

% Step 6: Highlight the maximum point on the graph
hold on;
plot(maxWeek, maxRain, 'ro', 'MarkerSize', 10, 'MarkerFaceColor', 'r');

% Step 7: Annotate the maximum point
text(maxWeek, maxRain + 2, ...
     sprintf('Max Rainfall = %d mm (Week %d)', maxRain, maxWeek), ...
     'HorizontalAlignment', 'center', 'FontWeight', 'bold', 'Color', 'r');

hold off;
