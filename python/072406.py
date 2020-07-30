from selenium import webdriver
import time
import os

from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
driver.get("http://127.0.0.1:90/biz/user-login-L2Jpei8=.html")
driver.implicitly_wait(10)
driver.find_element_by_id("account").send_keys("admin")
time.sleep(3)
driver.find_element_by_id("account").send_keys(Keys.TAB)
time.sleep(3)
driver.find_element_by_name("password").send_keys("wqnzdxhw..321")
driver.find_element_by_name("password").send_keys(Keys.ENTER)
time.sleep(6)
driver.quit()