from tkinter import E
import cv2
import numpy as np


img = cv2.imread('./220811/star.jpg',cv2.IMREAD_COLOR)

cv2.imshow('star',img)
cv2.waitKey(0)

print(img.shape)
try:
    for i in range(100):
        x = np.random.randint(0,181,1)[0]
        endx = x+100
        y = np.random.randint(0,121,1)[0]
        endy = y+100

        print(x,' ',endx)
        print(y,' ',endy)

        roi = img[x:endx,y:endy]
        print(roi.shape)

        x = np.random.randint(0,181,1)[0]
        endx = x+100
        y = np.random.randint(0,121,1)[0]
        endy = y+100

        print(x,' ',endx)
        print(y,' ',endy)

        img[x:endx,y:endy] = roi

        cv2.imshow('gora',img)
        cv2.waitKey(100)
except Exception as e:
    print(e)