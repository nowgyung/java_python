#문제1
# for i in range(0,10,2):
#     if i == 0: continue
#     print(7 * i, end = ' ')

#문제2
# i = 2
# while i <100:
#     i +=1
#     if i%2 ==0 : continue
#     elif i%3 ==0 : continue
#     print(i, end = ' ')

#문자3
i = 2
while i < 100:
    i = i%2!=0 
    print(i, end = '')
    break
i += 1