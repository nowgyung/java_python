from cProfile import label
from random import sample
from turtle import color
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import matplotlib


plt.style.use("ggplot")
matplotlib.rcParams['font.family']='Malgun Gothic'
matplotlib.rcParams['axes.unicode_minus']=False

data = pd.read_excel('./static/data/carprice.xlsx', sheet_name= 'train')

dt = data.groupby('종류').mean()

a = dt['년식'].to_numpy()
b1 = dt['배기량'].to_numpy()
b2 = dt['가격'].to_numpy()

# a = data.to_numpy()
# b1 = data.to_numpy()
# b2 = data.to_numpy()



plt.figure()
plt.hist(b2)
plt.show()


# fig, ax1  = plt.subplots()
# ax2 = ax1.twinx()

# ax1.plot(a, b1, '-s', color = 'green', markersize = 1, linewidth=1, alpha=0.7, label='text')
# # ax1.set_ylim(0,18)
# ax1.set_xlabel('년식')
# ax1.set_ylabel('가격')
# ax1.tick_params(axis='both', direction='in')

# ax2.bar(a, b2, color='blue', label='배기량', alpha=0.7, width=0.7)
# # ax2.set_ylim(0, 18)
# ax2.set_ylabel('배기량')
# ax2.tick_params(axis='y', direction='in')

# plt.show()




# line1 = ax1.plot(a, b1)
# line2 = ax2.plot(a, b2)
# plt.show()