import java.lang.System;
import java.net.*;
import java.io.*;
class bitserver
{
public static void main(String[] args)
{
try
{
//BufferedInputStream in;
ServerSocket Serversocket=new ServerSocket(500);
System.out.println("waiting for connection");
Socket client=Serversocket.accept();
DataOutputStream out=new DataOutputStream(client.getOutputStream());
BufferedInputStream in=new BufferedInputStream(client.getInputStream());
BufferedInputStream inn=new BufferedInputStream(client.getInputStream());
BufferedReader ki=new BufferedReader(new InputStreamReader(System.in));
int flag=0;
System.out.println("connect");
System.out.println("enter the no of frames to be requested to server:");
int c=Integer.parseInt(ki.readLine());
out.write(c);
out.flush();
int i,jj=0;
while(jj<c)
{
i=in.read();
System.out.println("received frame no"+i);
System.out.println("sending acknowledgement for frame no"+i);
out.write(i+1);
out.flush();
jj++;
}
out.flush();
in.close();
inn.close();
out.close();
client.close();
Serversocket.close();
System.out.println("quiting");
}
catch(IOException e)
{
System.out.println(e);
}
}
}
