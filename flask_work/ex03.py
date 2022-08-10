from sklearn.neighbors import KNeighborsRegressor
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd
import cv2


x_train = pd.read_excel('./static/data/carprice.xlsx', sheet_name="train", usecols=['연비'])
x_test = pd.read_excel('./static/data/carprice.xlsx', sheet_name="test", usecols=['연비'])
y_train = pd.read_excel('./static/data/carprice.xlsx', sheet_name="train", usecols=['마력'])
y_test = pd.read_excel('./static/data/carprice.xlsx', sheet_name="test", usecols=['마력'])

# print(x_train)
# print(y_train)
# print(x_test)
# print(y_test)

knr = KNeighborsRegressor(n_neighbors=3)
knr.fit(x_train, y_train)

pred = knr.predict([[3,3]])
print(pred)
