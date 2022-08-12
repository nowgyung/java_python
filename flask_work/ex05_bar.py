import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import matplotlib


plt.style.use("seaborn")
matplotlib.rcParams['font.family']='Malgun Gothic'
matplotlib.rcParams['axes.unicode_minus']=False

data = pd.read_excel('./static/data/carprice.xlsx')
dt = data.groupby('년식').mean()
print(dt)

joong = dt['중량'].to_numpy()
ka = dt['가격'].to_numpy()
bae = dt['배기량'].to_numpy()

plt.bar(dt.index.to_numpy(),joong,width=0.3, alpha=0.8, label='중량')
plt.bar(dt.index.to_numpy(),ka,width=0.3, alpha=0.8, label='가격', bottom=joong)
plt.bar(dt.index.to_numpy(),bae,width=0.3, alpha=0.8, label='배기량', bottom=joong+ka)


# plt.bar(dt.index.to_numpy()-0.1,dt['중량'].to_numpy(),width=0.1, alpha=0.5, label = 'gram')
# plt.bar(dt.index.to_numpy(),dt['가격'].to_numpy(),width=0.1, alpha=0.5, label = 'cost')
# plt.bar(dt.index.to_numpy()+0.1,dt['배기량'].to_numpy(),width=0.1, alpha=0.5, label = 'volume')

plt.title('년식별 중량,가격,배기량')
plt.legend()
plt.grid()
# plt.tight_layout()
plt.show()

plt.savefig('./static/car/joong_ka_bae.png')

