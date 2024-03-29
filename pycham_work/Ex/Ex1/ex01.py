from sklearn.neighbors import KNeighborsClassifier
import numpy as np
import matplotlib.pyplot as plt


fish_length = [25.4, 26.3, 26.5, 29.0, 29.0, 29.7, 29.7, 30.0, 30.0, 30.7, 31.0, 31.0,
                31.5, 32.0, 32.0, 32.0, 33.0, 33.0, 33.5, 33.5, 34.0, 34.0, 34.5, 35.0,
                35.0, 35.0, 35.0, 36.0, 36.0, 37.0, 38.5, 38.5, 39.5, 41.0, 41.0, 9.8,
                10.5, 10.6, 11.0, 11.2, 11.3, 11.8, 11.8, 12.0, 12.2, 12.4, 13.0, 14.3, 15.0]
fish_weight = [242.0, 290.0, 340.0, 363.0, 430.0, 450.0, 500.0, 390.0, 450.0, 500.0, 475.0, 500.0,
                500.0, 340.0, 600.0, 600.0, 700.0, 700.0, 610.0, 650.0, 575.0, 685.0, 620.0, 680.0,
                700.0, 725.0, 720.0, 714.0, 850.0, 1000.0, 920.0, 955.0, 925.0, 975.0, 950.0, 6.7,
                7.5, 7.0, 9.7, 9.8, 8.7, 10.0, 9.9, 9.8, 12.2, 13.4, 12.2, 19.7, 19.9]

fish_data = [[l,w] for l,w in zip(fish_length, fish_weight)]
fish_target = [1]*35 + [0]*14

kn = KNeighborsClassifier()
# print(fish_data[4]) #[29.0, 430.0]
# print(fish_data[:5]) # [[25.4, 242.0], [26.3, 290.0], [26.5, 340.0], [29.0, 363.0], [29.0, 430.0]]

train_input = fish_data[:35]
train_target = fish_target[:35]

test_input = fish_data[35:]
test_target = fish_target[35:]

kn =kn.fit(train_input, train_target) # 훈련세트로 훈련하겠다
score = kn.score(test_input, test_target) # 테스트 세트 성능이 어떤가
# print(score) # 0.0
#훈련세트와 테스트세트로 나누려면 골고루 섞일수 있도록 해야 (numpy)

#numpy를 사용해셔  넘파이 배열로 바꾸기
input_arr = np.array(fish_data)
target_arr = np.array(fish_target)

# print(input_arr) # 샘플 수 , 특성 수
# print(input_arr.shape) #(49, 2)

np.random.seed(42)
index = np.arange(49)
np.random.shuffle(index)
# print(index)
#[13 45 47 44 17 27 26 25 31 19 12  4 34  8  3  6 40 41 46 15  9 16 24 33
# 30  0 43 32  5 29 11 36  1 21  2 37 35 23 39 10 22 18 48 20  7 42 14 28
# 38]

# print(input_arr[[1,3]]) # [[ 26.3 290. ] [ 29.  363. ]]

train_input = input_arr[index[:35]]
train_target = target_arr[index[:35]]

# print(input_arr[13], train_input[0]) # [ 32. 340.] [ 32. 340.]

test_input = input_arr[index[35:]]
test_target = target_arr[index[35:]]

plt.scatter(train_input[:,0], train_input[:,1])
plt.scatter(test_input[:,0], test_input[:,1])
plt.xlabel('length')
plt.ylabel('weight')
# plt.show() # 파- 훈련세트 주-테스트세트 잘 섞임

kn = kn.fit(train_input, train_target)
score = kn.score(test_input, test_target)
# print(score) #1.0

prevalue = kn.predict(test_input)
# print(prevalue) # [0 0 1 0 1 1 1 0 1 1 0 1 1 0]
# print(test_target) # [0 0 1 0 1 1 1 0 1 1 0 1 1 0]








