sum = 0

class Accumulator:
    def __init__(self):
        self.sum=0
    @staticmethod 
    def add(self,i):
        global sum  # 밖에 선언되어있는 전역변수를 가져와서 사용하겠다
        self.sum = self.sum + i
    @staticmethod
    def showResult(self):
        print(f"sum = {self.sum}") # 문자열 안에 변수를 넣을때 파이썬3버전부터 가능