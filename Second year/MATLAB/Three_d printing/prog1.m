% z = x^2 + y^2
% for  −5≤𝑥,𝑦≤5  −5≤x,y≤5 using surf.

[x,y] = meshgrid(-5:0.5:5 , -5:0.5:5);
z = x.^2 + y.^2;

figure;

surf(x,y,z);

xlabel = "x-axis";
ylabel = "y-axis";
zlabel = "z-axis";

shading interp;
colormap jet;
colorbar;
