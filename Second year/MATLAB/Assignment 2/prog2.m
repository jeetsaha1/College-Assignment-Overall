%Assignment 2 (MATLAB)

% A company maintains two data tables - Sales table nad production table
% 1. Join the table to analyze the data
% 2. Compute total sales revenue per product
% 3. Find the top selling product
% 4. Calculate revenue per rigion
% 5. Generate summuerise statistics 
% 6. Plot the result

%1.
p_id = [22;34;43;24;35];
p_name = ["Computer";"Mobile";"Pamtop";"Laptop";"Calculator"];
p_unitPrice = [50000; 25000; 33000; 67000; 900];
product_Table = table(p_name,p_id,p_unitPrice);
disp(product_Table);

s_id = [21;32;54;61;43];
p_id = [22;34;43;24;35];
s_region = ["Kolkata";"Hoogly";"Kolkata";"Bankura";"Hoogly"];
s_quantity = [30;90;67;89;100];
sales_Table = table(s_id,p_id,s_region,s_quantity);
fprintf("The Table: \n");
disp(sales_Table);


%2.
Main_Table = innerjoin(product_Table, sales_Table, 'Keys', 'p_id');
disp(Main_Table);

sales_revenue  = 0;
for i = 1:height(Main_Table)
    sales_revenue = sales_revenue + (Main_Table.s_quantity(i)*Main_Table.p_unitPrice(i));
end
fprintf("The total sales revenue is %d",sales_revenue);

%3.
top_sale = 0;
for i = 1:height(Main_Table)
    if top_sale < Main_Table.s_quantity(i)
        top_sale = Main_Table.s_quantity(i);
    end
end

name = Main_Table.s_quantity == top_sale;
T_name = Main_Table(name,:);
name_= T_name(:,"p_name");
fprintf("The top selling product: \n");
disp(name_);

%4.
rev_kolkata = 0;
rev_hoogly = 0;
rev_bankura = 0;

for i =1:height(Main_Table)
    if Main_Table.s_region(i) == "Kolkata"
        rev_kolkata = rev_kolkata + (Main_Table.s_quantity(i) * Main_Table.p_unitPrice(i));
    elseif Main_Table.s_region(i) == "Hoogly"
        rev_hoogly = rev_hoogly + (Main_Table.s_quantity(i) * Main_Table.p_unitPrice(i));
    else
        rev_bankura = rev_bankura + (Main_Table.s_quantity(i) * Main_Table.p_unitPrice(i));
    end
end
fprintf("The revenue in Kolkata : %d\n",rev_kolkata);
fprintf("The revenue in Bankura : %d\n",rev_bankura);
fprintf("The revenue in Hoogly : %d\n",rev_hoogly);

%6.
sales_rev_per_product = zeros(1,height(Main_Table));

for i = 1:height(Main_Table)
    sales_rev_per_product(i) = Main_Table.s_quantity(i) *Main_Table.p_unitPrice(i); 
end
bar(Main_Table.p_name,sales_rev_per_product,'r');
title = ('Result');
xlabel ('Name');
ylabel('Sales revenue per product');
grid on;


% place = ["Kolkata","Hoogly","Bankura"];
% sales_rev_per_region = [rev_kolkata,rev_hoogly,rev_bankura];
% bar(categorical(place), sales_rev_per_region, 'r');
% xlabel('Places');
% ylabel('Sales revenue per region');
% grid on;    