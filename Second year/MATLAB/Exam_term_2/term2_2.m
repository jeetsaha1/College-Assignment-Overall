[x,y] = meshgrid(-5:0.1:5 , -5:0.1:5);
t = 100*exp(-x.^2-y.^2);
mesh(x,y,t);
contour3(t,50);
colormap jet;
colorbar east;