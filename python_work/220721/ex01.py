def doA():
    print("doA 11111")
    yield 1 # 반환값
    print("doA 22222")
    yield 2
    print("doA 33333")
    yield 3

a = doA()

print(type(a)) # generator , yield가 들어있는 ,반복자의 일종
ret = next(a)
print('ret = ',ret)
ret = next(a)
print('ret = ',ret)
ret = next(a)
print('ret = ',ret)
next(a) # StopIteration 예외발생
