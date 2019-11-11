import os
trac=input("Enter url/hostname= ")
cmd = 'tracert '+trac+' > out_file.txt'
os.system(cmd)
ip=input("Enter ip address to get mac= ")
filey=open("out_file.txt","r")
for i in filey.readlines():
    print(i)
filey.close()