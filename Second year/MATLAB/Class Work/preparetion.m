% Making a calculator

% ch = input("\n__MENU__\nEnter your choice: \n1.Addition\n2.Subtraction\n3.Nultiplication\n4.Division\nWhich one do you want: ");
% switch (ch)
%     case 1
%         a = input("Enter first no.: ");
%         b = input("Enter second no.: ");
%         fprintf("%d",a+b);
%     case 2
%         a = input("Enter first no.: ");
%         b = input("Enter second no.: ");
%         fprintf("%d",a-b);
%     case 3
%         a = input("Enter first no.: ");
%         b = input("Enter second no.: ");
%         fprintf("%d",a*b);
%     case 4
%         a = input("Enter first no.: ");
%         b = input("Enter second no.: ");
%         fprintf("%d",a/b);
%     otherwise
%         fprintf("You give wrong input");
% end



% Make a spiral of the matrix

% n = input("Enter the no. of rows and columns: ");
% a = zeros(n,n);
% 
% top = 1;
% left = 1;
% bottom = n;
% right = n;
% i=1;
% 
% while (top<=bottom && left <= right)
%     for j = left:1:right
%         a(top,j) = i;
%         i = i+1;
%     end
%     top = top +1;
% 
% 
%     for j = top:bottom
%         a(j,right) = i;
%         i = i+1;
%     end
%     right = right -1;
% 
%     if (top<=bottom)
%         for j = right:-1:left
%             a(bottom,j) = i;
%             i = i+1;
%         end
%     bottom = bottom -1;
%     end
% 
%     if(left <= right)
%         for j = bottom:-1:top
%             a (j,left) = i;
%             i = i+1;
%         end
%         left = left +1;
%     end
% end
% 
% disp(a);


% Write a code to find the possible no. of swapping is required for sorting
% the element of 1D array

% fprintf('Enter the no. of elements: ');
% n = input('');
% a = zeros(n,[]);
% for i=1:n
%     fprintf("Enter the value %d: ",i);
%     a(i) = input('');
% end

% % Bubble sorting
% count = 0;
% for i=1:n
%     for j =1:n-i
%         if a(j) > a(j+1)
%             count = count +1;
%             temp = a(j);
%             a(j) = a(j+1);
%             a(j+1) = temp;
%         end
%     end
% end
% disp(count);