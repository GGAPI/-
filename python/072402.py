from selenium import webdriver
import time


driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.maximize_window()
# context = driver.find_element_by_link_text("新闻").text
context = driver.find_element_by_id("s-bottom-layer-right").text
print(context)
driver.quit()
