import numpy as np
import  tensorflow as tf
from tensorflow import keras
from sklearn.model_selection import train_test_split

(train_input,train_target), (test_input, test_target) \
    = keras.datasets.fashion_mnist.load_data()

train_scaled = train_input.reshape(-1,784)/255
test_scaled = test_input.reshape(-1,784)/255

train_scaled,val_scaled,train_target,val_target = \
    train_test_split(train_scaled,train_target,random_state=42)

print(train_scaled.shape)
print(test_scaled.shape)

dense = keras.layers.Dense(10, activation = 'softmax', input_shape=(784,))

model = keras.Sequential(dense)
model.compile(loss = 'sparse_categorical_crossentropy', metrics = 'accuracy')

model.fit(train_scaled, train_target,  epochs=5)

훈련점수 = model.evaluate(train_scaled,train_target)
print(훈련점수)

#0티셔츠1바지2스웨터3드레스4코트5샌달6셔츠7스니커즈8가방9앵글부츠

import ex03

t1 = ex03.t1()/255.0
t1 = 1 - t1
print(np.round(t1,decimals=3))
pred = model.predict(t1.reshape(-1,784))
print(pred)

print(np.argmax(pred))

import matplotlib.pyplot as plt

plt.imshow(t1,cmap='gray_r')
plt.show()


s1 = ex03.s1()/255.0
s1 = 1 - s1
print(np.round(s1,decimals=3))
pred = model.predict(s1.reshape(-1,784))
print(pred)

print(np.argmax(pred))

import matplotlib.pyplot as plt

plt.imshow(s1,cmap='gray_r')
plt.show()



s2 = ex03.s2()/255.0
s2 = 1 - s2
print(np.round(s2,decimals=3))
pred = model.predict(s2.reshape(-1,784))
print(pred)

print(np.argmax(pred))

import matplotlib.pyplot as plt

plt.imshow(s2,cmap='gray_r')
plt.show()



