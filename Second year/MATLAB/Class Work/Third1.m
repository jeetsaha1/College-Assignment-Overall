% Write a code to check whether a number is armstrong or not

% num = input("Enter the number: ");
% temp = num;
% demo = num;
% power = 0;
% while temp ~= 0
%     power = power +1;
%     temp = floor(temp/10);
% end
% sum = 0;
% while num ~= 0
%     r = mod(num,10);
%     sum = sum + r^power;
%     num = floor(num / 10);
% end
% 
% if demo == sum
%     fprintf("The number is armstrong.");
% else
%     fprintf("The number is not armstrong.");
% end


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% Write a code to convert an octal number into a decimal number
% oct = input("Enter the octal number: ");
% temp = oct;
% power = 0;
% sum = 0;
% while temp> 0
%     r = mod(temp,10);
%     if r >= 8
%         fprintf("Sorry");
%         break;
%     end
%     sum = sum + r*8^power;
%     power = power+1;
%     temp = floor(temp/10);
% end
% disp(sum);


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% Write a code to convert the hexa decimal to decimal
% hex = input("Enter hexa decimal number: ",'s');
% temp = hex;
% sum = 0;
% power = 0;
% len = length(hex);
% for i = len:-1:1
%     if hex(i)>='0' && hex(i)<='9'
%         num = str2double(hex(i));
%     elseif hex(i)>='a' && hex(i)<='f'
%         num = hex(i) - 87;
% 
%     elseif hex(i)>='A' && hex(i)<='F'
%         num = hex(i) - 55;
%     end
%     sum = sum + (num * 16^power);
%     power = power +1;
% end
% disp(sum);

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% Write a code to find the gcf of two numbers
a= input("Enter first number: ");
b= input("Enter second number: ");
while b ~= 0
    temp = b;
    b = mod(a,b);
    a = temp;
end
disp(a);

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% Write a code to check whether a number is armstrong or not


% num = input("Enter the number: ");
% len = power(num);
% temp = num;
% sum = 0;
% while temp ~= 0
%     r = mod(temp,10);
%     sum = sum + r^len;
%     temp = floor(temp/10);
% end
% disp(sum);
% if sum == num
%     fprintf("The number is Armstrong.");
% else
%     fprintf("The number is not Armstrong.");
% end
% 
% function count = power (num)
%     count = 0;
%     while num ~= 0
%         count = count+1;
%         num = floor(num/10);
%     end
% end



% Convert octal to decimal

% oct = input("Enter the octal number : ");
% temp = oct;
% sum = 0;
% power = 0;
% while temp > 0
%     r = mod(temp,10);
%     if r>=8
%         fprintf("This is not an octal number");
%         break;
%     end
%     sum = sum + r*8^power;
%     power = power + 1;
%     temp = floor(temp/10);
% end
% disp(sum);



% Hexadecimal to decimal

% hex = input("Enter the hexadecimal no. : ",'s');
% len = length(hex);
% num =0;
% sum = 0;
% power = 0;
% for i= len:-1:1
%     if hex(i)>='0' && hex(i)<='9'
%         num = str2double(hex(i));
%     elseif hex(i)>='a' && hex(i) <= 'f'
%         num = hex(i) - 87;
%     elseif hex(i)>='A' && hex(i) <= 'F'
%         num = hex(i) - 55;
%     end
%     sum = sum + num * 16^power;
%     power = power +1;
% end
% disp(sum);



%Write a code to find the palindrome of a string

% str1 = input("Enter the string: ",'s');
% str = [str1 ' '];
% 
% word = '';
% i = 1;
% len = length(str);
% 
% while i<= len
%     if str(i) ~= ' '
%         word = [word str(i)];
%     else
%         l = length(word);
%         if l>0
    %         rev = '';
    %         for j = l:-1:1
    %             rev = [rev word(j)];
    %         end
    % 
    %         match = 1;
    % 
    %         for k= l:-1:1
    %             if rev(k) ~= word(k)
    %                 match = 0;
    %                 break;
    %             end
    %         end
    % 
    %         if match ==1 && l>0
    %             disp(word);
    %         end
    % 
    %         word = '';
    %     end
    % end
%     i = i+1;
% end
% 


% str1 = input("Enter the string: ",'s');  % take string input
% str1 = [str1 ' '];  % add space at the end to capture last word
% 
% word = '';
% i = 1;
% len = length(str1);
% 
% while i <= len
%     if str1(i) ~= ' '
%         word = [word str1(i)];
%     else
%         if ~isempty(word)
%             rev = '';  
%             l = length(word);
%             for j = l:-1:1
%                 rev = [rev word(j)];   % correct reversal
%             end
% 
%             if strcmp(word, rev)   % check palindrome
%                 disp(word);
%             end
%         end
%         word = ''; % reset for next word
%     end
%     i = i + 1;
% end




% Printing Floyd's triangle
% 
% n = input("Enter the number of lines: ");
% num = 1;
% 
% for i = 1:n
%     for j = 1:n-i
%         fprintf(" ");
%     end
%     num = 1;
%     for k= (1:i)
%         fprintf("%d ",num);
%         num = num*(i-k)/k;
%     end
%     fprintf("\n");
% end



% Printing pattern
% str = input("Enter :",'s');
% len = length(str);
% for i=1:len
%     for j=1:i
%         fprintf("%c ",str(j));
%     end
%     fprintf("\n");
% end



% The no. of words in a string
% str = input("Enter the sentence: ",'s');
% str = [str ' '];
% len = length(str);
% no_of_word = 0;
% for i=1:len
%     if str(i) == ' '
%         no_of_word = no_of_word+1;
%     end
% end
% 
% disp(no_of_word);
%% 




% Write a code to check whether a number is armstrong or not

% num = input("Enter the number: ");
% temp = num;
% demo = num;
% power = 0;
% while temp ~= 0
%     power = power +1;
%     temp = floor(temp/10);
% end
% sum = 0;
% while num ~= 0
%     r = mod(num,10);
%     sum = sum + r^power;
%     num = floor(num / 10);
% end
% 
% if demo == sum
%     fprintf("The number is armstrong.");
% else
%     fprintf("The number is not armstrong.");
% end


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%Write a code to search ana element into an 3x3 matrix

% a = zeros(3,3);

% for i = 1:3
%     for j = 1:3
%         n = sprintf("Enter the element [%d][%d]:",i,j);
%         a(i,j) = input(n);
%     end
% end

% ele = input("Enter the element for searching: ");

% for k = 1:3
%     for l = 1:3
%         if a(k,l) == ele
%             fprintf("The element is found at index :(%d,%d)",k,l);
%             break;
%         end
%     end
% end

% Write a matlab code to find the gcd of two numbers using function

% function a = hcf(a,b)
% 
% while(b~=0)
%     temp = b;
%     b = mod(a,b);
%     a = temp;
% end
% end
% 
% a = input("Enter first no.: ");
% b = input("Enter second no: ");
% disp(hcf(a,b));


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


% Write a matlab code to find the palindrome form a string

% cells = input("Enter the string: ",'s');
% str = [cells ' '];
% n = length(str);
% 
% word = '';
% rev = '';
% i=1;
% 
% while i<= n
%     if str(i) ~= ' '
%         word = [word str(i)];
%     else
% 
%         len = length(word);
%         rev = '';
% 
%         for j = len:-1:1
%             rev= [rev word(j)];
%         end
% 
%         match = 1;
%         for k = 1:len
%             if rev(k) ~= word(k)
%                 match =0;
%                 break;
%             end
%         end
% 
%         if match == 1 && len >0
%             disp(word);
%         end
% 
%         word = '';
%     end
%     i = i+1;
% end


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


% Write a matlab code to generate spiral matrix




% Change all of the characters with their cases accordingly
% str = input("Enter the sentence: ", 's');  % take input once
% len = length(str);
% 
% for i = 1:len
%     if str(i) >= 'a' && str(i) <= 'z'
%         str(i) = char(str(i) - 32);   % lowercase → uppercase
%     elseif str(i) >= 'A' && str(i) <= 'Z'
%         str(i) = char(str(i) + 32);   % uppercase → lowercase
%     end
% end
% 
% disp(str);   % print toggled result
