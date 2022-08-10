import imp
import pandas as pd
from sklearn.tree import DecisionTreeClassifier


train_df = pd.read_excel('https://github.com/cranberryai/todak_todak_python/blob/master/machine_learning/binary_classification/%E1%84%83%E1%85%A1%E1%86%BC%E1%84%82%E1%85%AD_%E1%84%8E%E1%85%AC%E1%84%8C%E1%85%A9%E1%86%BC_jvyrMwR.xlsx?raw=true', sheet_name='train')
test_df = pd.read_excel('https://github.com/cranberryai/todak_todak_python/blob/master/machine_learning/binary_classification/%E1%84%83%E1%85%A1%E1%86%BC%E1%84%82%E1%85%AD_%E1%84%8E%E1%85%AC%E1%84%8C%E1%85%A9%E1%86%BC_jvyrMwR.xlsx?raw=true', sheet_name='test')

# print(train_df.head)
x_data = train_df.iloc[:,1:-1].to_numpy()
y_data = train_df['당뇨여부'].to_numpy()
xtest_data = train_df.iloc[:,1:-1].to_numpy()
ytest_data = train_df['당뇨여부'].to_numpy()
# print(x_data[:5])
# print(y_data[:5])

dclf = DecisionTreeClassifier()
dclf.fit(x_data,y_data)

훈련점수 = dclf.score(x_data, y_data)
테스트점수 = dclf.score(xtest_data, ytest_data)

print(훈련점수)
print(테스트점수)
print(dclf.feature_importances_)