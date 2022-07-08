from point import Point

class Circle:
    #p = point() 생략가능
    def __init__(self,x,y,r):#생성자
        print("온다", x, y, r)
        self.p = Point(x,y)
        self.r = r


    def showInfo(self):
        self.p.showInfo()
        #pass #내용없을 때 적어줘야
        print(f"반지름 = {self.r}")

c =  Circle(2,2,4)
c.showInfo()
