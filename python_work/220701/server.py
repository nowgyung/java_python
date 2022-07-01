from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
    return ''' "<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        p::first-letter{font-size: 3em;}
        p::first-line{color: red;}
    </style>
</head>
<body>
    <h1>head</h1>
    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Repudiandae magni ullam dolorum distinctio necessitatibus optio saepe cumque eligendi! Necessitatibus delectus similique eligendi suscipit enim officia quo voluptatem veritatis. Odit, non?</p>
    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Culpa esse quis nobis rerum? Quis a deserunt exercitationem vitae? Ratione voluptas eaque natus voluptatem dolorem nobis cumque aperiam omnis molestias? Dolore.</p>
</body>
</html>" '''
app.run(host="192.168.0.4", port=5000)