import java.util.Scanner;
class Series{
  public static void main(String args[]){
  Scanner sc =new Scanner(System.in);
int num=sc.nextInt();
int number=12;
int sum=0; 
for(int i=0;i<num;i++)
 {
  System.out.print(number+" ");
  number=number+10;
  sum=sum+number;
 }
System.out.println();
System.out.println("sum of these numbers is "+sum);
}
}
  