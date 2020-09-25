import java.util.Scanner;
class Swap{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter two numbers :");
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("Numbers before swapping "+num1+"|"+num2);
num1=num1*num2;
num2=num1/num2;
num1=num1/num2;
System.out.println("Numbers after Swapping: "+num1+"|"+num2);
}
} 