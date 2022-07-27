from sklearn.cluster import KMeans
import  numpy as np
import  pandas as pd
import matplotlib.pyplot as plt

fruits = np.load('fruits_300.npy')
fruits_2d = fruits.reshape(-1, 10000)

km = KMeans(n_clusters=3)
km.fit(fruits_2d)

print(km.labels_)
print(np.unique(km.labels_,return_counts=True))
print('----------')

def draw_fruits(arr, 배율=1):
    n = len(arr)
    rows = int(np.ceil(n/10)) # 소수점 들어가면x
    cols = n if rows <2 else 10 # rows가 2보다 작으면 n 아니면 10
    fig, axs = plt.subplots(rows,cols,figsize=(cols*배율, rows*배율))
    for i in range(rows):
        for j in range(cols):
            if i*10 +j < n:
                axs[i,j].imshow(arr[i*10+j])
            axs[i,j].axis('off')

    plt.show()

draw_fruits(fruits[km.labels_==2])

# rows = np.ceil(111/10)
# print(rows)
# cols = 11 if 1< 2 else 10
# print(cols)

draw_fruits(fruits[km.labels_==0])
draw_fruits(fruits[km.labels_==1])

print(km.transform(fruits_2d[100:101]))
print('----------')

print(km.predict(fruits_2d[100:101]))
print('----------')

print(km.n_iter_)

inertia = []
for k in range(2,7):
    km = KMeans(n_clusters=k, random_state=42)
    km.fit(fruits_2d)
    inertia.append(km.inertia_)
plt.plot(range(2,7), inertia)
plt.xlabel('k')
plt.ylabel('inertia')
plt.show()

