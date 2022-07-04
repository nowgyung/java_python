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
'''
p1 = "123456-789000" 
day = p1.split('-')
print(day)
birth_only = day[0]
print(birth_only)
'''

p1 = "123456-789000"

birthday = p1.split('-')
birthday_only = birthday[0]

print(birthday_only)



