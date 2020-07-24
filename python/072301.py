from selenium import webdriver
import time


driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.maximize_window()


# driver.find_element_by_id("kw").send_keys("时代少年团")
# driver.find_element_by_name("wd").send_keys("时代少年团")
# driver.find_element_by_link_text("hao123").click()
# driver.find_element_by_partial_link_text("新").click()
# driver.find_element_by_id("su").click()

# driver.find_element_by_xpath("//*[@id='kw']").send_keys("TFBOYS")
# driver.find_element_by_xpath("//*[@id='su']").click()
driver.find_element_by_css_selector("#kw").send_keys("哔哩哔哩")
driver.find_element_by_css_selector("#su").click()
time.sleep(6)
driver.quit()