'''
문제1
0부터 증가시키며 9까지 출력을 보이는 while구문
'''
def doA():
    num = 0
    while num < 10:
        print("num = ",num)
        num += 1

doA()

'''
문제2
9에서부터 0까지 출력을 보이는 while구문1
'''
def doB():
    num=9
    while num > -1:
        print("num = ",num)
        num -= 1

doB()
