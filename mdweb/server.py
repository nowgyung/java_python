from io import BytesIO
from flask import Flask,render_template,send_file
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

app = Flask(__name__,static_folder='static',template_folder='templates')

lr = LinearRegression()

data = pd.read_csv(
       'https://raw.githubusercontent.com/nowgyung/java_python/main/pycham_work/mldl/chap3/chap.csv')
length = data['length'].to_numpy().reshape(-1,1)
weight = data['weight'].to_numpy()

lr.fit(length,weight)

@app.route("/")
def index():
    aa = "aaa 입니다"
    return render_template("index.html",key1=aa)

@app.route("/img/<int:aa>")
def imgdown(aa):
    print(aa)
    img = BytesIO()
    plt.scatter(length,weight)
    plt.scatter(aa,lr.predict( [[aa]] ))
    plt.savefig(img,format="png",dpi=100)
    plt.close()
    img.seek(0)
    return send_file(img,mimetype="image/png")


app.run(debug=True)