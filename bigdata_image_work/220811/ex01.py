import cv2

img = cv2.imread('./220811/star.jpg', cv2.IMREAD_COLOR)
print(img.shape)
for i in range(0,340,10):
    img[:,:i] = [255,255,0] # 파랑과 초록으로 한줄씩 바꾸면서
    cv2.imshow('star',img)
    a = cv2.waitKey(100) #0.1초마다
    print(a)
cv2.imwrite('star_copy.jpg',img)

img = cv2.imread('./220811/star.jpg', cv2.IMREAD_COLOR)
img_gray = cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)
print(img_gray.shape)
cv2.imshow('star',img_gray) # 같은영역을 이용
cv2.waitKey(0)
cv2.imwrite('star_gray.jpg',img_gray)