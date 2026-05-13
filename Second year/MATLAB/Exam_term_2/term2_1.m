%1. Write  Matlab script to create a table T with columns: City(string), MaxTemp(*C),Mintemp(*C), Humidity(%),for 6 cities
% Add a coupled column Range = MaxTemp - Mintemp

city = ["Kolkata";"Hoogly";"Howrah";"Coachbihar";"Chuchura";"Digha"];
maxTemp = [42; 40 ;38; 36; 40; 35];
minTemp = [20; 34 ;30; 30; 28; 30];
humidity = [80; 60; 79; 89; 65; 54];
t = table(city, maxTemp, minTemp, humidity);
disp(t);

range = zeros(height(t),1);
for i=1:height(t)
    range(i) = maxTemp(i) - minTemp(i);
end
t.Range = range;
disp(t);


%2. Sort the table by range decending and display the top 3 rows. Export only the column city, range to a new table variable
for j=1:height(t)
    for k=1:height(t)-i-1
        if(range(k) < range(k+1))
            temp = range(k);
            range(k) = range(k+1);
            range(k+1) = temp;
        end
    end
end

%disp(maxTemp);
top_city = strings(3,1);
top_range = zeros(3,1);
for i=1:3
    for k=1:height(t)
        if(range(i) == t.Range(k))
            top_city(i) = t.city(k,:);
            top_range(i) = t.Range(k);
            
            %fprintf("%s  %d\n",t.city(k),maxTemp(k));
        end
    end
end
t1 = table(top_city, top_range);
disp(t1);

%3.Write a 2d plot of Maxtemp , Mintemp with repect to the city in same graph. Add legend and & label of axis
x = [1 2 3 4 5 6];
new = [42 20;
    40 34;
    38 30;
    36 30;
    40 28;
    35 30];
l = t.city;
bar (x,new,'grouped');
legend('Maximum temp.','Minimum temp.');