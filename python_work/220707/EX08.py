import matplotlib.pyplot as plt

plt.scatter([i*2 for i in range(10)],[i*3 for i in range(10)])
#plt.savefig('a.pang')
plt.show()

mlist = list(range(10))
print(mlist)

mlist = [i for i in range(10)]
print(mlist)

mlist = [i*2 for i in range(10)]
print(mlist)

mlist = [(i*2,j) for i, j in zip(range(10), range(10))] # zip 앞에꺼는 i 뒤에것은 j에 넣는다 
print(mlist)