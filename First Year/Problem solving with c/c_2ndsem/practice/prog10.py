import pandas as pd
grades= pd.Series([87,89,100])
print(grades)
print(grades.to_string(index=False))
# grades_dict={'Wally':[87,88,89],
#              'eva':[90,98,98],
#              'sam':[78,98,89]}
# g=pd.DataFrame(grades_dict,index=['test1','test2','test3'])
print(grades.iloc[0])
# print(g)
# print(grades.loc[0])
# print(g.at['test1','eva'])
# # data=[10,20,30,40]
# u=pd.Series(data,index=[100,200,300,400])
# print(u)