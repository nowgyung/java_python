from regex import A


def doA(a=10):
    print(a)


for i in [1,2,3,4]:
    print(i, end='_\n')

print(end='\n') # print() end='\n' <-hide
for i in [1,2,3,4]:
    print(i, end='\n')

doA() 
doA(20)