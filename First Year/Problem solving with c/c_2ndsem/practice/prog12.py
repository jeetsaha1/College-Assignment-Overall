import matplotlib.pyplot as plt
import numpy as np
x=[1,2,3,4,5]
#plt.plot(x,y,"-.")

y=['a','b','c','d','e']
# plt.xlabel('Sales')
# plt.ylabel('count')
# plt.title('Marketing')
# plt.grid()
# plt.scatter(x,y)
plt.pie(x,labels=y)
plt.show()