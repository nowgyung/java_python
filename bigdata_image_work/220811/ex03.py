from tracemalloc import start
import cv2
import time

img = cv2.imread('./220811/star.jpg',cv2.IMREAD_COLOR)

start_time= time.time()
for i in range(100):
    for j in range(100):
        img[i,j] = [255,255,255] # 흰색이 되도록

print(f'걸린시간 =  % {time.time()-start_time}')

cv2.imshow('star',img)
cv2.waitKey(0)


start_time= time.time()
img[:100,:100] = [0,0,0] # 검은색
print(f'걸린시간 =  % {time.time()-start_time}') # 슬라이싱 연산이 더 빨린 진행한다

cv2.imshow('star',img)
cv2.waitKey(0)