#문제1
from sympy import nth_power_roots_poly


st=[1,2,3,4,5]
st[1:4]=[3]
print(st)
print()
#문제2
st=[1,2,3,4,5]
st[3:]=[3.5,4,5]
print(st)
print()
#문제3
st=[1,2,3,4,5]
st[1:4]=[]
print(st)
print()
#문제4
st=[1,2,3,4,5]
st[:] = []
print(st)
print()
#문제5
st=[1,2,3,4,5,6,7,8,9,10]
nt=st[0:11:2]
print(nt)
print()
#문제6
st=[1,2,3,4,5,6,7,8,9,10]
nt=st[1:11:2]
print(nt)