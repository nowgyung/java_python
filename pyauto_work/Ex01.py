import pyautogui

print(pyautogui.position())
# pyautogui.click(x=480, y=19, duration=2)

pyautogui.hotkey('win','r')
pyautogui.write('calc')
pyautogui.hotkey('enter')

pyautogui.sleep(1)
img = pyautogui.locateOnScreen('./pyauto_work/7.png',confidence=0.9) #all 아님!
pyautogui.click(img)

pyautogui.sleep(2)
win1 = pyautogui.getActiveWindow()
win1.close()