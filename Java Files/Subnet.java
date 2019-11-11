 import java.io.*;
import java.util.*;
public class Subnet {

  static String sq = "";
  public static void main(String[] args) throws IOException {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   int x=0;
   String s,s1,sx;  
   System.out.print("ENTER IP: ");
   s= br.readLine();
   s1 = s.substring(0,3);
   s1 = s1.replace(".","");
   int a = Integer.parseInt(s1);

   if(a>=0 && a<=127){
       String dm = "255.0.0.0";
       x=1;
       System.out.println("CLASS A");
       System.out.println("DEFAULT SUBNET MASK : " +dm);
   }else if (a>=128 && a<=191){
            String dm = "255.255.0.0";
            x=2;
            System.out.println("CLASS B");
            System.out.println("DEFAULT SUBNET MASK :" +dm);
         }else if(a>=192 && a<=223){
                 String dm = "255.255.255.0";
                 x=3;
                 System.out.println("CLASS C");
                 System.out.println("DEFAULT SUBNET MASK : " +dm);
                }
              else System.out.println("OUT OF RANGE"); 
assert x != 0 : "PROGRAM CANNOT RUN FURTHER ";
    if(x==1){
      sx = s.substring(0,3);
System.out.println("BITWISE ADDING: " +sx);
      sx = sx.concat(".0.0.0");
System.out.println("BITWISE ADDING: " +sx);
      sx = sx.replace("...","..");
      sx = sx.replace("..",".");
      System.out.println("BITWISE ADDING: " +sx);
   }else if(x==2){
           sx = s.substring(0,5);
System.out.println("BITWISE ADDING: " +sx);
           sx = sx.concat(".0.0");
System.out.println("BITWISE ADDING: " +sx);
           sx = sx.replace("...","..");
           sx = sx.replace("..",".");
           System.out.println("BITWISE ADDING: " +sx);
          }else if(x==3){
                 sx = s.substring(0,7);
System.out.println("BITWISE ADDING: " +sx);
                 sx = sx.concat(".0");
System.out.println("BITWISE ADDING: " +sx);
                 sx = sx.replace("...","..");
                 sx = sx.replace("..",".");
                 System.out.println("BITWISE ADDING: " +sx);

                } 
      System.out.print("ENTER SUBNET VALUE(1,2,3,4,5,6,7,8): ");
         int z = Integer.parseInt(br.readLine());
         convert(x,z);
  }

   static void convert(int x,int z){
     int count=0;
       while(z!=0){
        sq = sq.concat("1");
        z--;
        count++;
       }

       while(count!=8){
        sq = sq.concat("0");
        count++;
       }
     int decimal=Integer.parseInt(sq,2);
      if(x==1){
        System.out.println("11111111." + sq + ".00000000.00000000");
        System.out.println("255." + decimal + ".0.0");
      }
      if(x==2){
          System.out.println("11111111.11111111." + sq + ".00000000");
          System.out.println("255.255." + decimal + ".0");
      }
      if(x==3){
          System.out.println("11111111.11111111.11111111." + sq + "");
           System.out.println("255.255.255." + decimal);
      }
 }
}