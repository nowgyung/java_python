import cv2
import numpy as np
import matplotlib.pyplot as plt

woyo = cv2.imread('wt.png'.cv2.IMREAD_GRAYSCALE)
print(woyo.shape) # 넓이453 높이680  3개 있다
print()
# pltwoyou = cv2.cvtColor(woyo, cv2.COLOR_BGR2RGB) # bgr을 rgb로 바궈줘

#np.save('a.npz',[pltwoyou])

# pltwoyo = np.load('a.npy')

plt.scatter([10,20,30], [10,20,30,], s=1000)
plt.text(100,200, 'hi')
plt.imshow(woyo, cmap='gray_r')
plt.show()

