from tensorflow import keras
import numpy as np
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
import cv2

#데이터 셋 준비 (위)
model = keras.models.load_model('best-cnn-model.h5') 

(train_input, train_target), (test_input, test_target) = \
    keras.datasets.fashion_mnist.load_data()

train_scaled = train_input.reshape(-1, 28, 28, 1) / 255.0

train_scaled, val_scaled, train_target, val_target = train_test_split(
    train_scaled, train_target, test_size=0.2, random_state=42)



print(train_scaled[0].shape)
# model.predict()/

# plt.imshow(train_scaled[0].reshape(28,28), cmap='gray_r')
# plt.show()

#예측, 데이터불러오기
pred = model.predict(train_scaled[0:1])
print(pred)
print(np.argmax(pred))

classes = ['티셔츠', '바지', '스웨터', '드레스', '코트',
           '샌달', '셔츠', '스니커즈', '가방', '앵클 부츠']
        
print(classes[np.argmax(pred)])

import myloaddata

print(train_scaled[0:1])
print(train_scaled[0:1].shape)

p1 = myloaddata.doloadimg("p1")
s1 = myloaddata.doloadimg("s1")
t1 = myloaddata.doloadimg("t1")
gabang = myloaddata.doloadimg("gabang")

# plt.imshow(p1[0].reshape(28,28),cmap='gray_r')
# plt.show()
# plt.imshow(s1[0].reshape(28,28),cmap='gray_r')
# plt.show()
# plt.imshow(t1[0].reshape(28,28),cmap='gray_r')
# plt.show()
# plt.imshow(gabang[0].reshape(28,28),cmap='gray_r')
# plt.show()



# pred = model.predict(p1)
# print(classes[np.argmax(pred)])

# pred = model.predict(s1)
# print(classes[np.argmax(pred)])

# pred = model.predict(t1)
# print(classes[np.argmax(pred)])

# pred = model.predict(gabang)
# print(classes[np.argmax(pred)])


#save하는 함수 
for i in range(10):
    train = (1-train_scaled[i+i+1])*255
    myloaddata.dosaveimg(f'train{i}',train.reshape(28,28))