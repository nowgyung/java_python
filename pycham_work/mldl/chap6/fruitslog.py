import numpy as np
from sklearn.cluster import KMeans
from sklearn.linear_model import LogisticRegression

def getlog():
    target = np.array(['사과'] * 100 + ['파인애플'] * 100 + ['바나나'] * 100)
    fruits = np.load('fruits_300.npy')
    fruits2d = fruits.reshape(-1, 10000)
    lr = LogisticRegression()
    lr.fit(fruits2d, target)
    return lr # 프레딕트 할수있는 lr(훈련한 학습기)이 반환된다