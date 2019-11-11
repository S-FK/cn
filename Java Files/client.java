import java.lang.System;
import java.net.*;
import java.io.*;
import java.math.*;
class client
{
public static void main(String[] args)
{
try
{	
BufferedInputStream in;
InetAddress addr=InetAddress.getByName("localHost");
System.out.println(addr);
Socket connection=new Socket(addr,500);

System.out.println("received request for sending frames");
in=new BufferedInputStream(connection.getInputStream());
DataOutputStream out=new DataOutputStream(connection.getOutputStream());
int p=in.read();
System.out.println("sending.....");
for(int i=1;i<=p;++i)
{
System.out.println("sending frame no"+i);
out.write(i);
out.flush();
System.out.println("waiting for acknowledge");
Thread.sleep(5000);
int a=in.read();
System.out.println("received acknowledge for frame no:"+i+ "as" +a);
}
out.flush();
in.close();
out.close();
System.out.println("quiting");
}
catch(Exception e)
{
System.out.println(e);}}}
