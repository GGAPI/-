from selenium import webdriver
import time


driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")

driver.find_element_by_id("kw").send_keys("大鱼海棠")
driver.find_element_by_id("su").click()
driver.maximize_window()
time.sleep(6)
#浏览器的滚动条拖动到最低端
js = "var q=document.documentElement.scrollTop=10000"
driver.execute_script(js)
time.sleep(3)
#将滚动条移动到页面的顶部
js = "var q=document.documentElement.scrollTop=0"
driver.execute_script(js)
driver.set_window_size(400,800)
time.sleep(3)
# 同时控制浏览器的左右，上下
js = "window.scrollTo(200,200);"
driver.execute_script(js)
time.sleep(6)
driver.quit()

