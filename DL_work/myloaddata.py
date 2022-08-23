import cv2

#데이터 불러오는 함수
def doloadimg(filename):
    p1 = cv2.imread(f'./img/{filename}.png', cv2.IMREAD_GRAYSCALE)
    p1 = p1/255
    p1 = 1- p1
    return p1.reshape(1,28,28,1) # predict바로 진행가능


def dosaveimg(filename,filedate):
    cv2.imwrite(f'{filename}.png', filedate)

    
def tempread():
    p1 = cv2.imread(f'temp.png', cv2.IMREAD_GRAYSCALE)
    p1 = p1/255
    p1 = 1- p1
    return p1.reshape(1,28,28,1)

