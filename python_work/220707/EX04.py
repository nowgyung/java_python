'''
문제1
6과 45의 최소공배수를 구하는 코드 while문
6으로도 나눠지고 45로도 나눠지는 값들중 가장 작은값
45부터 시작
'''
# def doA():
#     lcm = 1
#     while True:
#         if lcm % 6 == 0 and lcm % 45 == 0:
#                 break
#         lcm += 1 
#     print("lcm ", lcm)

'''
문제2
42와 120의 최대공약수를 구하는 코드 while문
42로도 나눌수 있고 120로도 나눌수있는 값들중 가장 큰값
42부터 시작
'''

def doB():
    num = 42
    while num > 0:
        if 42 % num==0 and 120%num ==0:
            print(num, end = ' ')
            break
        num -=1

doB()