import java.io.*;
import java.net.*;
class echoclient
{
public static void main(String a[])
{
try
{
Socket s=new Socket("LocalHost",8000);
DataInputStream in=new DataInputStream(System.in);
BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
BufferedReader br2=new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintWriter print=new PrintWriter(s.getOutputStream());
System.out.println("\n msg to be echo:");
String str=br1.readLine();
print.println(str);
print.flush();
System.out.println(br2.readLine());
}
catch(UnknownHostException e)
{}
catch(IOException e)
{
System.out.println("\n error:"+e);
}
}
}

