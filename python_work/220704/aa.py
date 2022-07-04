class AA: #JAVA 7장 PYTHON 13장
    a = 10

    def doA(self):
        self.a =self.a+10   # a=10의 a는 doA의 a이고 self.a의 a는 self의 a이다 / 서로 다른 a
        print(self.a)
    def doB(self):
        self.a =self.a+20
        print(self.a)
    def doC(self):
        self.a =self.a+30
        print(self.a)


#aa = AA() #메모리에 올릴것, 정의
#aa.doA()
#aa.doB()
#aa.doC()
