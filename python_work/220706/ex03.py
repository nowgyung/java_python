'''
문제2 우리나라 주민등록번호는 다음과 같은 구조
생년월일 정보만 꺼내서 출력하고자 한다 이러한 기능을 제공하는 함수를 만들어보자
'''

def birth_only(p1):
    plist=p1.split("-")
    return plist[0]

p1 = "070609-2011xxx"
p1 = birth_only(p1)
print(p1)