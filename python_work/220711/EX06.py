a = 0
a += 1
def funcA():
    print(a)

def funcLocalA(n):
    print(n) #로컬변수라서 안에서만 가능 호출불가 / 지역변수

funcA()
funcLocalA(10)
print(a)
# print(n)