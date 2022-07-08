'''
162
구구단 7단을 출력하는 예제 짝수인것만
'''
for i in range(1,10):
    if (7*i) %2 ==0: 
        print(7 * i, end = ' ')

'''
2이상 100미만의 정수중 2로도 나눠지지않고 3으로도 나눠지지 않는수를 출력하는 코드
while루프 기반으로 작성
'''
print()
num = 2
while(num <100):
    if num%2!=0 and num%3!=0:
        print(num, end=' ')
    num +=1

'''
위 문제에서 continue를 사용해서 , 코드 수정
'''
print()
num = 1
while(num <100):
    num +=1
    if num%2==0 or num%3==0:
        continue
    print(num, end=' ')

'''
for루프 기반으로 2단부터 9단까지 만들어보자
'''
for dan in range(2,10):
    for i in range(1,10):
        print(dan*i, end=' ')
    print()

'''
174p
튜플을 인자로 전달하면 이를 리스트로 바꿔주는 함수를 만들어보자
'''
def to_list(ds):
    return list(ds)
ds = (1,2,3)
ds=to_list(ds)
