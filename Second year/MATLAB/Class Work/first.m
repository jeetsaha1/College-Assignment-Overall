%Write a code find out the highest and the highest and second highest from
%3x3 matrix

% a = zeros(3,3);
% for i=(1:3)
%     for j = (1:3)
%         n = sprintf("Enter the number[%d][%d]",i,j);
%         a(i,j) = input(n);
%     end
% end
% disp(a);

% b = reshape(a,1,[]);

% for i=(1:9)
%     for j=(1:(9-i))
%         if (b(j)>b(j+1))
%             t = b(j);
%             b(j) = b(j+1);
%             b(j+1) = t;
%         end
%     end
% end
% disp(b);
% disp(b(9));
% disp(b(8));


% Write a code to find out the highest and second highest from 3x3 matrix

a = zeros(3,3);
for i = 1:3
    for j = 1:3
        n = sprintf('Enter the number[%d][%d]: ', i, j);
        a(i,j) = input("Enter the number: ");   % ✅ this now works fine
    end
end
disp('The entered matrix is:');
disp(a);

% Convert matrix to row vector
b = reshape(a,1,[]);

% Bubble sort
for i = 1:9
    for j = 1:(9-i)
        if b(j) > b(j+1)
            t = b(j);
            b(j) = b(j+1);
            b(j+1) = t;
        end
    end
end

disp('Sorted elements:');
disp(b);
disp(['Highest number: ', num2str(b(9))]);
disp(['Second highest number: ', num2str(b(8))]);
