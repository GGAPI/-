from selenium import webdriver
import time


driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")


driver.find_element_by_id("kw").send_keys("乃万")
driver.find_element_by_id("su").click()
title1 = driver.title
print("title1 = "+title1)

driver.implicitly_wait(10)
driver.find_element_by_link_text(u"乃万_百度百科").click()
url = driver.current_url
print(url)
title2 = driver.title
print("title2 = "+title2)
# 浏览器的放大
driver.maximize_window()
time.sleep(8)
 # 设置浏览器的宽和高
driver.set_window_size(400,400)
time.sleep(6)
driver.quit()
