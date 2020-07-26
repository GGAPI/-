from selenium import webdriver
import time


driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.maximize_window()
driver.find_element_by_id("kw").send_keys("李飞")
driver.find_element_by_id("su").submit()
time.sleep(6)
driver.back()
time.sleep(6)
driver.forward()
time.sleep(6)

driver.quit()