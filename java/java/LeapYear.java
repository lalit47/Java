import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int Year=sc.nextInt();
boolean leap=false; 
if(Year%4==0)
{
 if (Year%100 == 0)
  {
   if (Year%400==0)
    {
     leap=true;
    }
     else 
        leap=false;
  }
  else
      leap=true;
}
else
    leap=false;

   if(leap)
{
    System.out.println(Year+" is  a Leap Year");
}
else
   System.out.println(Year+" is not a Leap Year");


}
}