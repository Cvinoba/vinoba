import java.io.*;
class num
{
public static void main(String arg[])
{
int a=Integer.parseInt(arg[0]);
int count=0;
while(a>9)
{
  count=count+1;
  a=a/10;
}
System.out.println(count);
}
}
