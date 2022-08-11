import numpy as np
import matplotlib.pyplot as plt
import cv2

a = np.arange(16).reshape(-1,4)
print(a)

b = a < 10
print(b)

a[b] = 100
print(a)

a_jpg = cv2.imread('a.jpg') #bgr 순서라 노란색이 보이지
a_jpg = cv2.cvtColor(a_jpg,cv2.COLOR_BGR2RGB) # rgb순서대로 

print(a_jpg.shape)
print(a_jpg[0,0])
print(a_jpg[0,1])


plt.imshow(a_jpg)
# plt.show()

myimg = np.full((512,512,3),[200,200,0])
plt.imshow(myimg)
plt.show()

#마스킹 연상 후에
# ya_ = a_jpg[:,:] > [200,200,0]
# a_jpg[ya_] = [0,0,255]
# plt.imshow(a_jpg)
# plt.show()

#[0 29 55]
test = img[:,:,1]