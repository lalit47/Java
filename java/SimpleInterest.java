import java.util.Scanner;
class SimpleInterest{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter Principle Amount:");
float Principle=sc.nextFloat();
System.out.print("Enter Time:");
float Time=sc.nextFloat();
System.out.print("Enter Rate:");
float Rate=sc.nextFloat();
float SimpleInterest=(Principle*Time*Rate)/100;
System.out.print("SimpleInterest : "+SimpleInterest);
}
}