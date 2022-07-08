class Point:
    def __init__(self,x,y):
        self.xpos = x
        self.ypos = y
        pass

    def showInfo(self):
        #print("xpos",self.xpos)
        print(f"xpos = {self.xpos} ypos = {self.ypos}") # f > point 클래스에 있는 self.xpos, self.ypos를 사용하겠다