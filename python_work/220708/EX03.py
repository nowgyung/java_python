import Won # as w1

import pandas as pd
import numpy as np

result=np.random.rand(10)
print(f"랜덤 값 나옵니다. {result}")

num = float(input("반지름 입력"))
result = Won.areawon(num)
print(f"넓이는 = {result}")
result = Won.cwon(2)
print(f"둘레는 = {result}")
