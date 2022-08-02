import numpy as np
from tensorflow import keras
from sklearn.model_selection import train_test_split
import matplotlib.pyplot as plt

(train_input, train_target), (test_input, test_target) = \
    keras.datasets.fashion_mnist.load_data()

train_scaled = train_input / 255.0
test_scaled = test_input / 255.0

train_scaled, val_scaled, train_target, val_target = train_test_split(
    train_scaled, train_target, test_size=0.2, random_state=42)

def model_fn(a_layer = None):
    model = keras.Sequential()
    model.add(keras.layers.Flatten(input_shape=(28,28)))
    model.add(keras.layers.Dense(100, activation='relu'))
    if a_layer:
        model.add(a_layer)
    model.add(keras.layers.Dense(10,activation='softmax'))
    return model

model = model_fn(keras.layers.Dropout(0.3))
model.load_weights('model_weights.h5')

import cv2
# 0티셔츠1바지2스웨터3드레스4코트5샌달6셔츠7스니커즈8가방9앵글부츠
gabang = cv2.imread('t1.png', cv2.IMREAD_GRAYSCALE)
gabang= 1- gabang

#따로 fit하지않고 바로 적용시킬수 있다
pred = model.predict(gabang.reshape(-1,28,28))
print(pred)
print(np.argmax(pred))

model = keras.models.load_model('best_model.h5')
pred = model.predict(gabang.reshape(-1,28,28))
print(pred)
print(np.argmax(pred))