import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import matplotlib

data = pd.read_excel('./static/data/carprice.xlsx')

dy = data.groupby('년식').mean()
dp = data.groupby('가격').mean()

plt.scatter(dy, dp)
plt.show()
