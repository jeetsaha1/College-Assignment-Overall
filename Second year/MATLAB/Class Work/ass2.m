% Simulate an ECG signal with combination of sine waves.
% y = sin(2*pi*1*t) + 0.5*sin(2*pi*3*t) 
% t = 0:0.01:5;

%  t = 0:0.01:5;
% y = sin(2*pi*1*t) + 0.5*sin(2*pi*3*t);

% plot(t,y,'r','LineWidth',2);

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


% Make a csv file for the inserting the data of time and temperature and plot the bar graph

% temp = (50:2:250)';
% time = (0:1:100)';

% t = table(temp,time);
% writetable(t,'temp-time.csv');

% data = readtable('temp-time.csv');

% figure;
% bar(temp,time);
% xlabel 'Temp';
% ylabel 'Time';



%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


% Create a 3D surface plot based on the bar chart data
% Retain the current plot

% [x,y] = meshgrid(-10: 1: 10 , 10: -1 : -10);

%  D = exp(-(x.^2 + y.^2)/50);

% surf(x, y, D);
% xlabel('X-axis');
% ylabel('Y-axis');
% zlabel('D Value');
% title('3D Surface Plot of D');


% shading interp;
% colormap jet;
% colorbar;


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


% [x,y] = meshgrid(-5:0.5:5 , -5:0.5:5);
% z = sin(sqrt(x.^2)+ (y.^2));
% figure;

% surf(x,y,z);

% xlabel = "x-axis";
% ylabel = "y-axis";
% zlabel = "z-axis";

% shading interp;
% colormap jet;
% colorbar;

% z = peaks(x,y);
% contour3(x,y,z,30);

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

% Q.Plot a 3d contour of z = sin x * cos y
%   for -2pi <= x  and y >= 2pi

% [x,y] = meshgrid(-2*pi:0.1:2*pi, -2*pi:0.1:2*pi);

% z = sin(x) .* cos(y);


% figure;
% contour3(x,y,z,30);
% xlabel('x');
% ylabel('y');
% zlabel('z = sin(x)cos(y)');
% title('3D Contour of z = sin(x)cos(y)');
% grid on;



%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

t=0:0.1:10;
s = (5*t)+ (0.5*2*t.^2);
plot(t,s,'-s','LineWidth','2');