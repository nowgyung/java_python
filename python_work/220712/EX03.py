from multiprocessing.sharedctypes import Value


try:
    age = int(input('나이입력'))
    a = age/0

except Exception as e :
    print('모든 예외는 여기로 옵니다.', e) #어떠 에러가 발생되었는지 e에 표시

# except ValueError:
#     print('한글로 적으면')
# except ZeroDivisionError:
#     print('0으로 나눌수 있다면')

print('종료됩니다.')