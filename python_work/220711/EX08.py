from asyncore import poll3
from person import Person

p1=Person() #메모리에 올리는것
p2=Person()
p3=Person()

p1.age = 39 # age추가
p1.up_age()
print(p1.get_age())

#p2.age = 59
#p2.up_age() #age에 대한 속성 정보가 없다
#print(p2.get_age())


n=100
print(type(n))
print(n.bit_length())

a = [1,2,3,4]
print(type(a))
print(a.remove(1))
print(a)