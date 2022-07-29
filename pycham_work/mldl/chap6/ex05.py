import numpy as np
from sklearn.cluster import KMeans
from sklearn.linear_model import LogisticRegression # 타깃값 있어야

import matplotlib.pyplot as plt
import cv2


fruits = np.load('fruits_300.npy')
print(fruits.shape)
print('----------')
fruits2d = fruits.reshape(-1,10000)


plt.axis('off')
plt.imshow(fruits[0], cmap='gray_r')
plt.savefig('pltfruits0.png')

cv2.imwrite('cvfruits0.jpg', fruits[205])

km = KMeans(n_clusters=3, random_state=42)
km.fit(fruits2d)# 비지도학습이라 타깃값 주지 않

prevalue = km.predict([fruits2d[0]])
print(prevalue)
print('----------')

a = cv2.imread('cvfruits0.jpg',cv2.IMREAD_GRAYSCALE)
print(a.shape)
print('----------')

pred = km.predict(a.reshape(-1,10000))
print(pred)
print('----------')

target = np.array(['사과']*100+['파인애플']*100+['바나나']*100)
print(target.shape) #(300,)
print(target[:5])
print(target[100:105])
print(target[200:205])
print('----------')


lr = LogisticRegression()
lr.fit(fruits2d,target)

pred = lr.predict(fruits2d[0].reshape(-1,10000))  #2차원데이터로 만들기 위해서 -1에 10000개의 특성
print(pred)
pred = lr.predict(fruits2d[100].reshape(-1,10000))
print(pred)
pred = lr.predict(fruits2d[200].reshape(-1,10000))
print(pred)
print('----------')

pred = lr.predict(a.reshape(-1,10000))
print(pred)
print('----------')

