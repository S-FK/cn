import java.io.*;
import java.net.*;
class address
{
InetAddress ip;
public static void main(String args[]) throws UnknownHostException
{
InetAddress ip=InetAddress.getLocalHost();
System.out.println("\n IP address is :"+ip);
String s1=ip.getHostName();
System.out.println("system number is:"+s1);
}
}
