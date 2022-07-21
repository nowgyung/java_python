import sys

def doA():
    yield from [10,20,30,40,50,60,70,80,90,100,110,120,130,140]
        # 한개씩 반환된도록, 그때그때가서 반환,

a = [10,20,30,40,50,60,70,80,90,100,110,120,130,140]
b = doA()

print(sys.getsizeof(a)) # 차지하는 비중이 얼마인가가
print(sys.getsizeof(b))

print(next(b))
print(next(b))
print(next(b))
