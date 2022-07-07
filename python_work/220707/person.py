class Person:
    name=""
    def __init__(self, name): #self는 무조건 작성 생략불가
        self.name=name
    def __str__(self): #__는 정해짐
        return "Person "+ self.name