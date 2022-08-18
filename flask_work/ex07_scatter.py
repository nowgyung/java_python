from cProfile import label
from random import sample
from turtle import color
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import matplotlib


plt.style.use("Solarize_Light2")
matplotlib.rcParams['font.family']='Malgun Gothic'
matplotlib.rcParams['axes.unicode_minus']=False

data = pd.read_excel('./static/data/carprice.xlsx', sheet_name= 'train')

# dt = data.sort_values(['년식']).groupby('가격').head()
# print(dt)

# a = dt['년식'].to_numpy()
# b1 = dt['배기량'].to_numpy()
# b2 = dt['가격'].to_numpy()


plt.title('가격별 마력과 토크')
plt.legend()

plt.scatter(data['가격'], data['마력'],data['토크'], c="brown")
# plt.show()

plt.savefig('./static/car/scatter_kmt.png')



# print(a)
# print(b1)
# print(b2)

# # plt.plot(a, b1)
# # plt.plot(a, b2)
# plt.pie(['년식'])

# plt.show()




