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




from flask import Flask,render_template

app = Flask(__name__,template_folder="templates")

@app.route('/')
def hello_world():
    num= 10
    myst = "DB에서 읽었는 내용"
    return render_template('index.html', num=num,myst=myst)

@app.route('/aa')
def aa():
    return "aa"

@app.route('/bb')
def bb():
    return "bb"

@app.route('/cc')
def cc():
    return "cc"




