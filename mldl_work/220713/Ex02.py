import numpy as np

a = [1,2,3,4,5]
npa = np.array(a)

a = a*5
npa = npa*5
print('a',a)
print('npa',npa)

print(npa.shape) # 리스트안에 5개가 있다

## np.random.seed(42)
#a = np.random.randint(1,100,5)
#print(a)
#print(type(a))