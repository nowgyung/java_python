#문제1

# def main():
#     num = int(input('input number'))
#     if num > 0 or num ==0:
#         print('입력한 값은 0이거나 0보다 큽니다.')
#     else:
#         print('입력한 값은 0보다 작습니다.')

# main()


#문제2

""">>> num=3
>>> if num>1 and num<5:
...     print('true')
... else:
...     print('false')
... 
true"""


#문제3
'''
num=12
>>> if num <3 or num >10:
...     print('true')
... else:
...     print('false')
... 
true
'''

#문제4
'''
>>> num = 4
>>> if num%2==0 and num%3!=0:
...     print('true')
... else:
...     print('false')
... 
true
'''

#문제5
def main():
    num = int(input('숫자 입력'))
    if num < 0:
        print('입력한 값은 0보다 작습니다.')
    elif 0 <= num < 10:
        print('입력한 값은 0이상 10 미만입니다.')
    elif 10 <= num < 20:
        print('입력한 값은 10이상 20미만입니다.')
    else:
        print('입력한 값은 20이상입니다.')

main()
