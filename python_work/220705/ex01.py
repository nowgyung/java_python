'''
문제3
본문에서 리스트에 저장된 내용 전부를 삭제하는 clear 함수를 소개하였다.
슬라이싱 연산을 이용하는 방법을 이용해서 코드 소개
'''


st=[1,2,3,4]
st[:]= []
print(st)

'''
 The Espresso Sprit
 대문자, 소문자, 원본
'''
st = "The Espresso Spirit"
print(st.upper())
print(st.lower())
print(st)

cnt = 0
for i in st:
    if i=='E':
        print(i)
        print(cnt)
    cnt+=1
print(st.find('E'))


myst = "한글\n 영어"
print(myst)
myst = "한글\t 영어"
print(myst)
myst = "한글\" 영어"
print(myst)
myst = "한글\' 영어"
print(myst)

mylist = [1,2,3,4,5]
del mylist[3:]
print(mylist)

del mylist[:]
print(mylist)