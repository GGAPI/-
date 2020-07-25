from selenium import webdriver
import time


driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.maximize_window()
driver.find_element_by_id("kw").send_keys("迪丽热巴")
driver.find_element_by_id("su").click()
time.sleep(6)
driver.find_element_by_id("kw").clear()
time.sleep(3)
driver.find_element_by_id("kw").send_keys("古力娜扎")
driver.find_element_by_id("su").submit()

time.sleep(6)
driver.quit()