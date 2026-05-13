% Write a code to create 3x3 matrix and perform 
% 1. Elementwise multiplication
% 2. Inverse of a matrix
% 3. Rank of a matrix

A = zeros(3,3);
B = zeros(3,3);
c = zeros(3,3);

% Taking input for A
for i = 1:3
    for j = 1:3
        fprintf("Enter the number for A(%d,%d): ", i, j);
        A(i,j) = input('');
    end
end

% Taking input for B
for i = 1:3
    for j = 1:3
        fprintf("Enter the number for B(%d,%d): ", i, j);
        B(i,j) = input('');
    end
end

% First Part: Elementwise multiplication
for i = 1:3
    for j = 1:3
        c(i,j) = A(i,j) * B(i,j); 
    end
end

disp('Elementwise multiplication result:');
disp(c);

% Second part: Determinant of the mat(A)

C = zeros(3,3);

detA = A(1,1)*(A(2,2)*A(3,3) - A(2,3)*A(3,2)) ...
      - A(1,2)*(A(2,1)*A(3,3) - A(2,3)*A(3,1)) ...
      + A(1,3)*(A(2,1)*A(3,2) - A(2,2)*A(3,1));

C(1,1) =  (A(2,2)*A(3,3) - A(2,3)*A(3,2));
C(1,2) = -(A(2,1)*A(3,3) - A(2,3)*A(3,1));
C(1,3) =  (A(2,1)*A(3,2) - A(2,2)*A(3,1));

C(2,1) = -(A(1,2)*A(3,3) - A(1,3)*A(3,2));
C(2,2) =  (A(1,1)*A(3,3) - A(1,3)*A(3,1));
C(2,3) = -(A(1,1)*A(3,2) - A(1,2)*A(3,1));

C(3,1) =  (A(1,2)*A(2,3) - A(1,3)*A(2,2));
C(3,2) = -(A(1,1)*A(2,3) - A(1,3)*A(2,1));
C(3,3) =  (A(1,1)*A(2,2) - A(1,2)*A(2,1));


adjA = C';

disp(detA);

inv_A = adjA*(1/detA);
disp(inv_A);


% Third part : Rank of a matrix

rankA = 0;

d= zeros(3,3);
d(1,1) =  (A(2,2)*A(3,3) - A(2,3)*A(3,2));
d(1,2) =  (A(2,1)*A(3,3) - A(2,3)*A(3,1));
d(1,3) =  (A(2,1)*A(3,2) - A(2,2)*A(3,1));

d(2,1) = (A(1,2)*A(3,3) - A(1,3)*A(3,2));
d(2,2) = (A(1,1)*A(3,3) - A(1,3)*A(3,1));
d(2,3) = (A(1,1)*A(3,2) - A(1,2)*A(3,1));

d(3,1) =  (A(1,2)*A(2,3) - A(1,3)*A(2,2));
d(3,2) =  (A(1,1)*A(2,3) - A(1,3)*A(2,1));
d(3,3) =  (A(1,1)*A(2,2) - A(1,2)*A(2,1));

if detA ~= 0
    rankA = 3;
else
    for i = 1:3
        for j = 1:3
            if d(i,j) ~=0
                rankA = 1;
            else 
                for k = 1:3
                    for l = 1:3
                        if A(i,j) == 0
                            rankA =0;
                        else
                            continue;
                        end
                    end
                end
            end
        end
    end
end


disp(rankA);


