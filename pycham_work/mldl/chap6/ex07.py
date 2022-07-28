import matplotlib.pyplot as plt
from sklearn.decomposition import PCA
import numpy as np


fruits = np.load('fruits_300.npy')
fruits2d = fruits.reshape(-1,10000) # -1은 끝 까지, 300과 같은 의미

pca = PCA(n_components=0.5)
pca.fit(fruits2d) # 학습진행 후 50개로 줄이기 위한 컴포넌프가 나온다 (도장)




print(pca.components_.shape)

fruits_pca = pca.transform(fruits2d)
print(fruits_pca.shape)

fruits_inverse_pca = pca.inverse_transform(fruits_pca)
print(fruits_inverse_pca.shape)

def draw_fruits(arr,ratio=1):
    n = len(arr)
    print('n = ',n)
    rows = int(np.ceil(n/10))
    print('rows = ',rows)
    cols = n if rows<2 else 10
    print('cols = ',cols)
    _,axs =plt.subplots(rows,cols,squeeze=False) #5 행 10열의 이미지그리기
    for i in range(10):
        for j in range(10):
            if i *10 +j<n:
                axs[i,j].imshow(arr[i*10+j],cmap='gray_r')
                axs[i,j].axis('off')
    plt.show()
print('----------')
# draw_fruits(pca.components_.reshape(-1,100,100)) # -1은 50과 같은 의미
#draw_fruits(fruits_pca.reshape(-1,5,10))# 300 개의 50
# draw_fruits(fruits_inverse_pca.reshape(-1,100,100)[:100])
# draw_fruits(fruits_inverse_pca.reshape(-1,100,100)[100:200])
# draw_fruits(fruits_inverse_pca.reshape(-1,100,100)[200:300])


plt.scatter(fruits_pca[:100,0],fruits_pca[:100,1])
plt.scatter(fruits_pca[100:200,0],fruits_pca[100:200,1])
plt.scatter(fruits_pca[200:300,0],fruits_pca[200:300,1])
plt.legend(['apple', 'pineapple','banana'])
plt.show()

from sklearn.linear_model import LogisticRegression

target = np.array(['사과']*100+['파인애플']*100+['바나나']*100)
lr = LogisticRegression()
lr.fit(fruits2d,target)

pred = lr.predict(fruits2d[0].reshape(-1,10000))
print(pred)
pred = lr.predict(fruits2d[100].reshape(-1,10000))
print(pred)
pred = lr.predict(fruits2d[200].reshape(-1,10000))
print(pred)
print('----------')

