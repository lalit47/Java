import java.util.Scanner;
class LargestNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
/*if(a>b && a>c)
{
System.out.println("Greatest Number is "+a);
}
else if(a<b && c<b)
{
System.out.println("Greatest Number is "+b);
}
else if(c<a && c<b)
{
System.out.println("Greatest Number is "+c);
}
*/
String s=(a > b) ? (( a > c ) ? "Largest Number is "+a : "Largest Number is "+c) : ((b > c) ? "Largest Number is "+b :"Largest Number is "+c);
System.out.println(s);
}
}