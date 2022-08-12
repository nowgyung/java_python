from random import sample
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import matplotlib


plt.style.use("ggplot")
matplotlib.rcParams['font.family']='Malgun Gothic'
matplotlib.rcParams['axes.unicode_minus']=False

data = pd.read_excel('./static/data/carprice.xlsx')
# data = pd.read_excel('./static/data/carprice.xlsx',usecols=['년식'])
# data1 = pd.read_excel('./static/data/carprice.xlsx', usecols=['가격'])

dt = data.groupby('종류').mean()

bae = dt['배기량'].to_numpy()
ka = dt['가격'].to_numpy()
old = dt['년식'].to_numpy()

plt.barh(dt.index.to_numpy(),bae, alpha=0.8, label='배기량')
plt.barh(dt.index.to_numpy(),ka, alpha=0.8, label='가격',left= bae )
plt.barh(dt.index.to_numpy(),old, alpha=0.8, label='년식',left= bae+ka )



plt.title('종류별 배기량,가격,년식')
plt.legend()
plt.grid()
# plt.show()

plt.savefig('./static/car/barh_bko.png')
