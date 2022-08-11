import cv2

img = cv2.imread('./220811/star.jpg',cv2.IMREAD_COLOR)

print(img.shape)
print(img.size)

px = img[100,100]

print(px)
print(px[2])