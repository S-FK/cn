# -*- coding: utf-8 -*-
"""
Created on Sat Nov  9 16:26:49 2019

@author: Sriharsha
"""

msg=input("Enter the data to be sent= ")
divisor=input("Enter the divisor= ")
le=len(divisor)
tosend=msg
msg=msg+(le-1)*"0"
datatoxor=msg[:len(divisor)]
msg=msg[le:]
msglen=len(msg)
def xor(a,b):
    r=""
    for i in range(len(a)):
        x=""
        x=a[i]+b[i]
        if x=="00" or x=="11":
            r=r+"0"
        elif x=="01" or x=="10":
            r=r+"1"
    return r
while msglen>=1:
    if datatoxor[0]=="1":
        datatoxor=xor(datatoxor,divisor)
    else:
        datatoxor=xor(datatoxor,"0"*le)
    datatoxor=datatoxor[1:]
    datatoxor=datatoxor+msg[0]
    if len(msg)>1:
        msg=msg[1:]
    else:
        if datatoxor[0]=="1":
            datatoxor=xor(datatoxor,divisor)
        else:
            datatoxor=xor(datatoxor,"0"*le)
        datatoxor=datatoxor[1:]
        break
    msglen=msglen-1
tosend=tosend+datatoxor
print("Remainder is=",datatoxor)
print("Data to be sent is=",tosend)
msg=input("Enter the data received= ")
print(msg)
datatoxor=msg[:len(divisor)]
msg=msg[le:]
msglen=len(msg)
while msglen>=1:
    if datatoxor[0]=="1":
        datatoxor=xor(datatoxor,divisor)
    else:
        datatoxor=xor(datatoxor,"0"*le)
    datatoxor=datatoxor[1:]
    datatoxor=datatoxor+msg[0]
    if len(msg)>1:
        msg=msg[1:]
    else:
        if datatoxor[0]=="1":
            datatoxor=xor(datatoxor,divisor)
        else:
            datatoxor=xor(datatoxor,"0"*le)
        datatoxor=datatoxor[1:]
        print(datatoxor)
        if "1" in datatoxor:
            print("Error in data!")
        else:
            print("Data received without an error!")
        break
    msglen=msglen-1
