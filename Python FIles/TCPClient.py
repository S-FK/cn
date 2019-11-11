
import socket
host, port = "127.0.0.1", 9999
data = str(input("enter a string to send:"))
tcp_client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
try:
    tcp_client.connect((host, port))
    tcp_client.sendall(data.encode())
    received = tcp_client.recv(1024)
finally:
    tcp_client.close()
print ("Bytes Sent:     {}".format(data))
print ("Bytes Received: {}".format(received.decode()))