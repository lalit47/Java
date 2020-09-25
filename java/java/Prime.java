import java.util.Scanner;
class Prime{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=2;
boolean flag=true;
for(i=2;i<num;i++)
{
   if(num%i==0)
   {
    System.out.println(num+" is not a prime number");
    flag=false;
    break;  
   }
}
   if(flag)
   { 
   System.out.println(num+" is a prime number");
   }
} 
}