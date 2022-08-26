from flask import Flask, request, render_template, send_file
import pandas as pd
from io import BytesIO
import matplotlib.pyplot as plt
import re

app = Flask(__name__)

data = pd.read_csv('kisa.csv', encoding='euc-kr')
table_data = data[['종목명', '년도', '성별', '필기시험접수', '필기시험응시', '필기시험합격', '필기시험합격률(퍼센트)',
                   '실기시험접수', '실기시험응시', '실기시험합격', '실기시험합격률(퍼센트)', '자격취득자현황(명)']].to_numpy()


columns = ['생산관리분야','공정관리','품질경영','품질관리','포장','디자인분야','서비스·경험디자인',
'제품디자인','시각디자인','컬러리스트','건축분야','실내건축','건축' ,'건축설비' ,'토목분야' ,'콘크리트' ,'토목', '항로표지', 
'측량및지형공간정보',
 '지적', '해양1급' ,'해양환경' ,'해양자원개발', '해양공학','응용지질', '건설재료시험', '철도보선', '철도토목' ,'조경분야',
 '조경' ,'도시.교통분야' ,'도시계획', '교통' ,'채광분야' ,'화약류관리', '광산보안', '지하수' ,'광해방지분야' ,'광해방지',
 '기계제작분야' ,'일반기계', '계량1급(제11류)', '기계공정설계' ,'기계설계' ,'치공구설계', '정밀측정(기계분야)',
 '정밀측정(전기분야)', '정밀측정', '계량(전기분야)', '계량(기계분야)' ,'계량(물리분야)' ,'기계장비설비.설치분야', '농업기계',
 '윤활관리', '건설기계' ,'건설기계설비' ,'건설기계정비' ,'궤도장비정비' ,'메카트로닉스', '승강기', '공조냉동기계' ,'설비보전',
 '철도분야' ,'철도차량', '조선분야', '조선' ,'선박기계1급', '항공분야', '항공' ,'자동차분야', '그린전동자동차',
 '그린전동자동차기사', '자동차정비' ,'자동차검사', '금형.공작기계분야' ,'사출금형설계', '프레스금형설계' ,'금속.재료분야',
 '금속1급', '금속(재료분야)', '금속(제련분야)', '금속(가공분야)', '금속', '금속재료', '세라믹' ,'용접분야', '용접',
 '화공분야', '화공' '공업화학' '화약류제조' '화학분석' '바이오화학제품제조' '생물공학' '섬유분야' '섬유1급' '방직'
 '섬유기계', '염색가공' ,'방사' ,'섬유물리', '섬유화학', '섬유' ,'생사' ,'의류' ,'전기분야' ,'전기' ,'전기공사', '철도신호',
 '전기철도', '전자분야' ,'임베디드', '전자', '반도체설계' ,'의공' '로봇기구개발', '로봇소프트웨어개발' ,'로봇하드웨어개발',
 '전자계산기' ,'광학', '공업계측제어' ,'정보기술분야', '정보처리' ,'전자계산기조직응용', '빅데이터분석' ,'정보보안',
 '방송.무선분야' ,'방송통신' ,'무선설비' ,'유선설비1급' ,'통신분야' ,'전파통신' ,'전파전자', '정보통신' ,'전파전자통신',
 '식품분야' ,'식품' ,'수산제조' ,'식육가공' ,'인쇄.사진분야', '인쇄', '제판' ,'농업분야' ,'종자', '화훼장식' ,'유기농업',
 '농화학' ,'시설원예' ,'축산분야', '축산', '임업분야', '식물보호', '산림' ,'산림공학' ,'산림경영' ,'임업종묘', '임산가공',
 '어업분야' ,'해양생산관리', '수산양식(1류)', '수산양식(2류)', '수산양식(3류)' ,'수산양식(4류)', '수산양식' ,'어병',
 '어로' ,'어업생산관리' ,'안전관리분야', '산업안전' ,'건설안전' ,'화재감식평가', '농작업안전보건' ,'방재' ,'가스'
 '산업위생관리' ,'인간공학' ,'소방설비(기계분야)','소방설비1급', '소방설비(전기분야)', '소방설비(화공)', '소방설비(토목)',
 '소방설비(건축)', '비파괴검사분야', '방사선비파괴검사', '초음파비파괴검사', '자기비파괴검사', '침투비파괴검사' ,'와전류비파괴검사',
 '비파괴검사1급(전자기침투)', '누설비파괴검사' ,'환경분야' ,'온실가스관리', '온실가스관리기사' ,'환경위해관리',
 '환경관리1급(소음진동)', '농림토양평가관리' ,'대기환경', '수질환경', '소음진동' ,'대기환경,수질환경,소음진동', '생물분류',
 '자연생태복원' ,'토양환경', '폐기물처리', '생물분류(식물)', '생물분류(동물)' ,'에너지.기상분야',
 '신재생에너지발전설비(태양광)', '원자력', '에너지관리', '열관리', '기상', '기상감정']

def pltmake(names):
    x = []
    y = []
    names = re.split(',',names)
    print('pltmake',names)
    for name in names:
        if len(name) >0: #빈공백이 들어올때도 있기에
            rowsdata = data[data['종목명'] == name]
            try:
                x.append(name)
                y.append(rowsdata.iloc[0, -1])
            except:
                pass
    return x, y

@app.route("/",methods=['GET','POST'])
def index():
    linnames = ['전기공사', '가스', '전자계산기', '신재생에너지발전설비(태양광)', '빅데이터분석']
    eno_names = ""
    if request.method =='POST':
        linnames = request.form.getlist('xitem')
        for name in linnames:
            eno_names = eno_names + name+","
    else:
        eno_names = '전기공사,가스,전자계산기,신재생에너지발전설비(태양광),빅데이터분석' #get방식일때
    return render_template("index.html", table_data=table_data,columns=columns,linnames=eno_names)

@app.route("/gra/<linnames>")
def gra(linnames):
    x, y = pltmake(linnames)
    plt.figure(figsize=(13,5))
    plt.rc('font', family='Malgun Gothic')
    plt.bar(x, y, color=['red', 'green', 'yellow', 'blue', 'gray'])
    plt.xlabel('자격증')
    plt.ylabel('누적취득자수')
    img = BytesIO()
    plt.savefig(img, format="png", dpi=100)
    plt.close()
    img.seek(0)
    return send_file(img, mimetype='image/png')


app.run(debug=True)  # 웹 서버가 돌기 시작하면서 사용자의 요청을 기다리고 있다(클라이언트,브라우저)
