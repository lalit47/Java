import java.util.Scanner;
class EmployeeSalary{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double BasicSalary=sc.nextFloat();
double HRA,DA,GrossSalary;

if(BasicSalary<10000){
   HRA =BasicSalary*.1;
   DA = (BasicSalary*.9);
   
}else {
  HRA =2000;
  DA =(BasicSalary*.98);
}
GrossSalary=BasicSalary + HRA +DA;
System.out.println("GrossSalary= "+GrossSalary);
}
}