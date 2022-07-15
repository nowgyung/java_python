from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier
import matplotlib.pyplot as plt
import pandas as pd
import numpy as np

data = pd.read_excel('data.xlsx')
# print(data)
length = data['length'].to_numpy()
# print(length[:5])
weight = data['weight'].to_numpy()
# print(weight[:5])
target = data['target'].to_numpy()

data = np.column_stack([length, weight])
print(data[:5])  # 2차원배열, 쌍으로 묶음
print(data.shape)  # 49개의 행의 2개의 요소

data5 = np.full((3, 3), 5)
print(data5)

train_input, test_input, train_target, test_target \
    = train_test_split(data, target, random_state=42, stratify=target)  # 두줄로 적을 때 '\'적음
print(train_input.shape)
print(test_input.shape)

print(train_target.shape)
print(test_target.shape)

kn = KNeighborsClassifier()
#학습해라 train_input 이 들어가면 train_target이 나온다라는 걸로
kn.fit(train_input,train_target)
#점수보자 test_input이 들어가면 test_target이 나오는데 너가 예측한것과 동일하나
score=kn.score(test_input, test_target)
print(score)

prevalue = kn.predict([[25,150]])
print(prevalue)

dis, index = kn.kneighbors([[25,150]])
print(dis)
print(index)
print(train_input[index]) # 가장 가까운 좌표를 보여줘,

mean = np.mean(train_input,axis=0)
std = np.std(train_input,axis=0) # 표준편차 - 0부터 얼마나 떨어져있나

print(mean)
print(std)

train_scaled = (train_input - mean)/std
test_scaled = (test_input - mean)/std

predata = (np.array([25,150])-mean)/std #np배열로 선언
print(predata)

kn = KNeighborsClassifier()
kn.fit(train_scaled,train_target)

score = kn.score(test_scaled,test_target)
print(score)

predictvalue = kn.predict([predata])
print(predictvalue)

dis,index = kn.kneighbors([predata])

#plt.scatter(train_scaled[:,0],train_scaled[:,1])
#plt.scatter(predata[0],predata[1],marker='^')
#plt.scatter(train_scaled[index,0],train_scaled[index,1],marker='D')
#plt.show()


# plt.scatter(train_input[:,0], train_input[:,1])
# plt.scatter(test_input[:,0], test_input[:,1])
# plt.scatter(train_input[index,0],train_input[index,1],marker='D')
# plt.legend(['train','test','neighbors']) # 범례표시, 위치설정도 가능
# plt.scatter(25,150,marker='^')
# plt.show()