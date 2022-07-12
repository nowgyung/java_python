import pyautogui

img = pyautogui.locateOnScreen('./pyauto_work/i.png',confidence=0.9)
pyautogui.click(img)

pyautogui.sleep(1)

pyautogui.write('http:www.naver.com/')
pyautogui.hotkey('enter')


pyautogui.sleep(2)
win1 = pyautogui.getActiveWindow()
win1.close()