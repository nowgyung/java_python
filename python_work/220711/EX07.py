cnt = 100 #전역변수
i = 100

def doA():
    cnt = 0
    print('지역변수', cnt) # doA()라는 공간이 따로있다 호출하는 순간 소멸


doA()
print('전역변수', cnt)


def doB():   #지역변수
    for i in range(10):
        print(i)
    print('결과= ',i)
    


doB()
print(i) 