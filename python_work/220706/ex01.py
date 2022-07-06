speed = 0

while True:
    print("1. 속도입력")
    print("2. 속도입력")
    print("3. 종료")
    select = int(input("속도입력?: "))
    if (select ==1):
        print("속도입력?: ")
        speed = input(" ")
        print("현재 속도는 "+speed)
    elif (select ==2):
        print("속도입력?: ")
        speed = input(" ")
        print("현재 속도는 "+speed)
    else:
        print("현재 속도는 "+speed)
        print("종료합니다.")
        break



