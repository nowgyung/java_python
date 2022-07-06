#문제1
'''
>>> str = "The Espresso Spirit"
>>> ucp = str.upper()
>>> ucp
'THE ESPRESSO SPIRIT'
>>> lcp = str.lower()
>>> lcp
'the espresso spirit'
>>> str
'The Espresso Spirit'
'''



#문제2
p1 = "123456-789000"

def birth_only():
    birth = p1.split('-')
    birthday= birth[0]
    print(birthday)

birth_only()







