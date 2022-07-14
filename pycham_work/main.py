import a


def print_hi(name):
    print(f'hi, {name}')
    print('main.py', __name__)
    a.doA()

if __name__ == '__main__':
    print_hi('PyCharm') #main 이면 실행해라
    