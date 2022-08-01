from tensorflow import keras
from sklearn.model_selection import train_test_split
import numpy as np
import ex03

(train_input, train_target), (test_input, test_target) = keras.datasets.fashion_mnist.load_data()

train_input,val_input, train_target, val_target =\
    train_test_split(train_input,train_target, random_state=42)

train_scaled = train_input/255.0
test_scaled = test_input/255.0
val_scaled = val_input/255.0

model = keras.Sequential()
model.add(keras.layers.Flatten(input_shape=(28,28)))
model.add(keras.layers.Dense(100,activation = 'relu'))
model.add(keras.layers.Dense(10,activation = 'softmax'))

model.compile(loss='sparse_categorical_crossentropy',metrics = 'accuracy', optimizer ='sgd')

model.fit(train_scaled, train_target, epochs=7)

훈련점수 = model.evaluate(train_scaled,train_target)
print(훈련점수)
# 0티셔츠1바지2스웨터3드레스4코트5샌달6셔츠7스니커즈8가방9앵글부츠

gabang = 1- ex03.gabang()
t1 = 1- ex03.t1()
s1 = 1- ex03.s1()
s2 = 1- ex03.s2()

pred = model.predict(gabang.reshape(-1,28,28))
print(np.round(pred,decimals=0))
print(np.argmax(pred))


pred = model.predict(t1.reshape(-1,28,28))
print(np.round(pred,decimals=2))
print(np.argmax(pred))


pred = model.predict(s1.reshape(-1,28,28))
print(np.round(pred,decimals=2))
print(np.argmax(pred))


pred = model.predict(s2.reshape(-1,28,28))
print(np.round(pred,decimals=2))
print(np.argmax(pred))
