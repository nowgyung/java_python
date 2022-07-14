'''
243p
문제1 친구의 이름과 전화번호 정보를 담을 수 있는 클래스를 만들어보자
클래스 friend 정의.
'''

from numpy import number


class friend:
    def __init__(self, name,phone):
        self.name = name
        self.phone = phone

    