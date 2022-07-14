from pagelast.a import Friend
#문제2
mylist=[Friend("윤지민", "010-111-222"), Friend("이선준", "010-222-333"), Friend("장지우", "010-333-444"),Friend("윤지윤", "010-444-555")]

# 빈공간 mylist=[] 를 놓고 mylist.append(Friend("윤성우", "010-111-222")) 형태로 넣어도 된다
#for f in mylist:
    #print(f)

#문제3
#for f in mylist:
#    if f.get_name().startswith('윤'):
#        print(f)


#문제4
for f in mylist:
    if f.get_name == '장지우':
        f.set_phone("010-999-999")
for f in mylist:
    print(f)


#문제1
#f = Friend("윤성우", "010-111-222")
#print(f.get_name())
#print(f.get_phone())
#f.set_phone("010-333-4444")
#print(f)
