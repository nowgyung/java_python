from tkinter import E
import cv2
import numpy as np

img = cv2.imread('./220811/star.jpg',cv2.IMREAD_COLOR)


cv2.imshow('img[:,:,0]',img[:,:,0])
cv2.waitKey(0)

img[:,:,2] = 0 # r없애기

cv2.imshow('star',img)
cv2.waitKey(0)