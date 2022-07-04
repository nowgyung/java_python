#문제1
'''
>>> st=[]
>>> st.append(1)
>>> st.append(2)
>>> st.append(3)
>>> st
[1, 2, 3]
>>> st.remove(1)
>>> st.remove(2)
>>> st.remove(3)
>>> st
[]  
>>> 
'''
#문제2
'''
>>> st=[]
>>> st.append(1)
>>> st.append(2)
>>> st.append(3)
>>> st
[1, 2, 3]
>>> st.pop(-1)
3   
>>> st.pop(-1)
2   
>>> st.pop(0)
1   
>>> st
[]
'''
#문제3
'''
>>> st=[1,2,3,4] 
>>> st=[]
>>> st
[]  
-
>>> st=[1,2,3,4]
>>> st[:]= []
>>> st
[]  
'''
#문제4
list=[]
for i in range(1,11):
    list.append(i)
    print(list)
for i in range(1,11):
    list.remove(i)
    print(list)
#문제5
for i in range(1,11):
    list.append(i)
    print(list)
for i in range(10,0,-1):
    list.remove(i)
    print(list)
#문제5
'''
>>> st=[1,2]
>>> st[3:]=[3,4,5]
>>> st
[1, 2, 3, 4, 5]
'''











































