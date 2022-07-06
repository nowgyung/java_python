'''
num에 저장된 값이 '1보다 크면서 동시에 5보다 작은가?'를 묻는 문장
'''

num = 3
1 < num <5


'''
'''
from regex import P


num = 12
num < 3  or num >10


'''
'''

num = 4
num %2 ==0 and num%3!=0

'''
'''

def main():
    num = int(input('입력'))
    if num < 0:
        print('입력한 값은 0보다 작다')

    elif 10 > num <=0 :
        print('입력한 값은 0이상 10미만입니다.')

    elif 20> num >= 10:
        print('입력한 값은 10이상 20미만입니다.')
    else:
        print('입력한 값은 20이상입니다.')

main()