import java.util.Scanner;
class Radius{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the radius :");
double Radius=sc.nextDouble();
double Area=3.14*(Radius * Radius);
System.out.println("Area : "+Area);
double Circumference=2*(3.14*Radius);
System.out.println("Circumference :"+Circumference);
}
}