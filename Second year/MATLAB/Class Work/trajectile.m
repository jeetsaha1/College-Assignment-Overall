u = 20;
theta = 45;
g = 9.8;

theta_rad = deg2rad(theta);

x = 100:-1:1;
y = x.*tan(theta_rad) - (g * x.^2) / (2 * u^2 * cos(theta_rad)^2);

plot(x,y);
xlabel("Distance");
ylabel("Height");
grid on;