import copy

a = [10,20,30,40,(50,60),[10,20,30]]
b = a #b 같은 공간을 가리키는 변수

a[0] = [555, 666]

print(a)
print(b)
print("카피하기 전")

c = copy.copy(a) #a를 복사해서 c로 담기
a[-1] = [888, 999]

print(a)
print(c)

a[-2] = (333, 444)
print(a)
print(c)

a[-1][0]+=10
print(a)
print(c)