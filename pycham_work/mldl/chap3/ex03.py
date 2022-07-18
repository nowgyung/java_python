from sklearn.neighbors import KNeighborsRegressor
import numpy as np

x1 = np.array([5,8,9,10,11,12,13,14])
x1 = x1.reshape(-1,2) #2개의 데이터가 1개의 요소로
print(x1)

nr = KNeighborsRegressor(n_neighbors=3) # 이웃점 3개 비교
nr.fit(x1,[30,32,35,40])

prevalue = nr.predict([[7,8]]) # 5,8,9를 가져와서 나누기 3 한것
print(prevalue)
