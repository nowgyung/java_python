import pyautogui 

print(pyautogui.size())
print(pyautogui.position())

#pyautogui.moveTo(x=548, y=19)
#pyautogui.click()
#pyautogui.click('./python_work/220711/help.png')

img = pyautogui.locateOnScreen('./python_work/220711/help.png',confidence=0.9) #90% 같으면 찾기
pyautogui.click(img)
