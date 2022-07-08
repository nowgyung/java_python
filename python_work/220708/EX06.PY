from openpyxl import Workbook
import numpy as np

wb = Workbook() #새로운 엑셀파일만들어라
ws = wb.active # 워크시트를 가리키는 말

#index = 1
for r in range(1,11):
    for c in range(1,11):
        ws.cell(row=r,column=c).value=np.random.randint(0,100)
        #index +=1


wb.save('b.xlsx')
wb.close()