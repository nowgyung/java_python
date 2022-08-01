import cv2


def gabang():
    gabang = cv2.imread('gabang.png', cv2.IMREAD_GRAYSCALE)
    print(gabang.shape)
    return gabang


def t1():
    t1 = cv2.imread('t1.png',cv2.IMREAD_GRAYSCALE)
    return t1

def s1():
    s1 = cv2.imread('s1.png',cv2.IMREAD_GRAYSCALE)
    return s1

def s2():
    s2 = cv2.imread('s2.png',cv2.IMREAD_GRAYSCALE)
    return s2