from tensorflow import keras
from sklearn.linear_model import SGDClassifier
import matplotlib.pyplot as plt



(train_input, train_target), (test_input, test_target) = keras.datasets.fashion_mnist.load_data()

print(train_input.shape)
print(train_target.shape)
print('----------')

train_input = train_input.reshape(-1,784)
test_input = test_input.reshape(-1,784)
train_scaled = train_input/255.0
test_scaled = test_input/255.0

sgd = SGDClassifier(loss='log', random_state=42,max_iter=5)
sgd.fit(train_scaled,train_target)

훈련점수 = sgd.score(train_scaled, train_target)
테스트점수 = sgd.score(test_scaled, test_target)
print(훈련점수)
print(테스트점수)
print('----------')

plt.imshow(train_input[0].reshape(28,28), cmap='gray_r')
# plt.show()

plt.imshow(train_scaled[0].reshape(28,28),cmap='gray_r')
# plt.show()

#0티셔츠1바지2스웨터3드레스4코트5샌달6셔츠7스니커즈8가방9앵글부츠
pred = sgd.predict(train_scaled[0].reshape(-1, 784)) # 28*28
print(pred)
pred = sgd.predict(train_scaled[1].reshape(-1, 784)) # 28*28
print(pred)
print('----------')

plt.imshow(train_scaled[1].reshape(28,28),cmap='gray_r')
# plt.show()


import numpy as np
print(np.round(train_scaled[1].reshape(28,28), decimals=2))

mydata = np.random.rand(784)
print(mydata.shape)
print(mydata) #랜덤으로 뽑아낸 숫자들 모양이 보이지x
print('----------')


mydata = mydata.reshape(28,28)
mydata[:14,0] = 0
mydata[:13,1] = 0
mydata[:12,2] = 0
mydata[:11,3] = 0
mydata[:10,4] = 0
mydata[:9,5] = 0

mydata[:0,16] = 0
mydata[:1,17] = 0
mydata[:2,18] = 0
mydata[:3,19] = 0
mydata[:4,20] = 0
mydata[:4,21] = 0
mydata[:4,22] = 0
mydata[:4,23] = 0
mydata[:4,24] = 0
mydata[:4,25] = 0
mydata[:3,26] = 0
mydata[:2,27] = 0

mydata[20:,0] = 0
mydata[21:,1] = 0
mydata[23:,2] = 0
mydata[24:,3] = 0
mydata[24:,4] = 0
mydata[24:,5] = 0
mydata[25:,6] = 0
mydata[25:,7] = 0
mydata[25:,8] = 0
mydata[24:,9] = 0
mydata[24:,10] = 0
mydata[24:,11] = 0
mydata[24:,12] = 0
mydata[24:,13] = 0
mydata[24:,14] = 0
mydata[24:,15] = 0
mydata[24:,16] = 0
mydata[24:,17] = 0
mydata[24:,18] = 0
mydata[23:,19] = 0
mydata[23:,20] = 0
mydata[23:,21] = 0
mydata[23:,22] = 0
mydata[22:,23] = 0
mydata[21:,24] = 0
mydata[21:,25] = 0
mydata[20:,26] = 0
mydata[20:,27] = 0


plt.imshow(mydata, cmap='gray_r')
plt.show()

pred = sgd.predict(mydata.reshape(-1,784))
print(pred)
























