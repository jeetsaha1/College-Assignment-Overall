% Print the follwing pattern

%       $ $ $ $ $ $ $ 
%       $           $ 
%       $           $ 
%       $           $ 
%       $           $ 
%       $           $ 
%       $ $ $ $ $ $ $ 


n = 7;
for i = 1:7
    for j = 1:7
        if (i ==1 || i == n || j == 1 || j==n)
            fprintf("$ ");
        else
            fprintf("  ");
        end
    end
    fprintf("\n");
end
        