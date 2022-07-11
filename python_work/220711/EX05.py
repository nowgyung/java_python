'''
181p
문제1 7단을 거꾸로 출력하는 코드 for , while기반으로 만들어보자
'''
for i in range(9,0,-1):
    print(i*7, end=' ')

print()
'''
문제2 다음 튜플을 만들어보자 1부터 100까지 증가
'''

a = [i for i in range(1,101)]
a = tuple(a)
b = [i for i in range(99, 0, -1)]
b = tuple(b)
c = a + b
print(c)

'''
import numpy as np

a= np.arange(1, 10)
print(list[a])

a= [i for i in range(1, 10)]
print(a)
'''


'''
문제3 다음실행결과가 보이도록
'''
'''
for i in range(3):
...     print(i,i+1,i+2)
...
0 1 2
1 2 3
2 3 4
>>> for i in range(3):
...     print(i+1,i+2,i+3)
...
1 2 3
2 3 4
3 4 5
'''