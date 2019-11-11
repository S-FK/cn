import time 
import requests    
url = "http://"+input("Enter hostname/website= ")
t1 = time.time() 
r = requests.get(url) 
t2 = time.time() 
tim = str(t2-t1)   
print(tim