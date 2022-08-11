import imp
from sklearn.neighbors import KNeighborsRegressor
from sklearn.model_selection import train_test_split
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
import cv2

file = './static/data/carprice.xlsx'

fuel_data = pd.read_excel(file , usecols=['연비'])
power_data = pd.read_excel(file, usecols=['마력'])

fuel_data = np.array(fuel_data)
power_data = np.array(power_data)

train_input, test_input, train_target, test_target =\
    train_test_split(fuel_data, power_data, random_state= 42)

train_input = train_input.reshape(-1,1)
test_input = test_input.reshape(-1,1)

knr = KNeighborsRegressor(n_neighbors=3)
knr.fit(train_input, train_target)

pred = knr.predict([[3,13]])
print(pred)

plt.scatter(train_input[:,0],train_input[:,1], label='train_input[:,0], train_input[:,1]')
plt.scatter(4,5)
for count, x in enumerate(train_input):
    plt.text(x[0]+0.1, x[1]+0.1,train_target[count])



# plt.xlabel('fuel_data')
# plt.ylabel('power_data')
# plt.show()


# print(fuel_data)
# print(power_data)








