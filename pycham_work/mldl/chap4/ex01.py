import pandas as pd #엑셀파일 읽어들이는 방법
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import SGDClassifier #리그레서 -회귀하겠구나 클래스파이 - 분류하겠구나


data = pd.read_excel('fish_data.xlsx')
print(data.info())

fish_input = data[['Weight','Length','Diagonal','Height','Width']].to_numpy()
fish_target = data['Species'].to_numpy()

print(fish_input.shape)
print(fish_target.shape)

print(fish_input[:5])
print(fish_target[:5])

train_input, test_input, train_target, test_target =\
    train_test_split(fish_input, fish_target,random_state=42)

print(train_input[:5])
print(train_target[:5])

ss = StandardScaler()
ss.fit(train_input)

train_scaled = ss.transform(train_input)
test_scaled = ss.transform(test_input)

print(train_scaled[:5])
print(test_target[:5])

sgd = SGDClassifier(loss='log', max_iter=100, random_state=42)
sgd.fit(train_scaled, train_target)

훈련점수 = sgd.score(train_scaled,train_target)
테스트점수 = sgd.score(test_scaled,test_target)

print(훈련점수)
print(테스트점수)

예측값 = sgd.predict(test_scaled[:5])
print(예측값)
print(test_target[:5])

sgd.partial_fit(train_scaled,train_target) # 조금더 훈련해봐라

훈련점수 = sgd.score(train_scaled,train_target)
테스트점수 = sgd.score(test_scaled,test_target)

print(훈련점수)
print(테스트점수)

예측값 = sgd.predict(test_scaled[:5])
print(예측값)
print(test_target[:5])

sgd.partial_fit(train_scaled,train_target) # 조금더 훈련해봐라

훈련점수 = sgd.score(train_scaled,train_target)
테스트점수 = sgd.score(test_scaled,test_target)

print(훈련점수)
print(테스트점수)

예측값 = sgd.predict(test_scaled[:5])
print(예측값)
print(test_target[:5])

# indexsx= (train_target == 'White_fish')
# print(indexsx)
# indexsx =(test_target == 'White_fish')
# print(indexsx)
# 예측값 = sgd.predict(train_scaled[indexsx])
# print(예측값)
# print(train_target[indexsx])

sc = SGDClassifier(loss='log',random_state=42)

train_score=[]
test_score=[]

classes = np.unique(train_target)
print(classes)

for _ in range(300):
    sc.partial_fit(train_scaled,train_target,classes=classes)

    train_score.append(sc.score(train_scaled,train_target))
    test_score.append(sc.score(test_scaled,test_target))

print(train_score[:5])
print(test_score[:5])

import matplotlib.pyplot as plt

plt.plot(train_score)
plt.plot(test_score)
plt.show()

print(test_score[-1])















