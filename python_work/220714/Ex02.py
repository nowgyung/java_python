'''
217p
문제1
과자의 가격정보가 담김 딕셔너리, 정보를 추가하는 코드 작성

문제2
모든과자의 가격 100원씩 올리기

문제3
'콘치즈'의 이름을 '치즈콘'으로 변경 해보자
'''

dc = {'새우깡':700, '콘치즈':850, '꼬깔콘':750}
dc['홈런볼'] = 900
print(dc)

for i in dc:
    dc[i] += 100
print(dc)

del dc['콘치즈']
print(dc)
dc['치즈콘'] = 950
print(dc)