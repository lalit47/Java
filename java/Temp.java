import java.util.Scanner;
class Temp{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter tempreture in fahrenheite");
float f=sc.nextFloat(); 
float C=5*(f-32)/9 ;
System.out.println(C+" Celsius");
}
}