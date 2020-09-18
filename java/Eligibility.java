import java.util.Scanner;
class Eligibility{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int age=sc.nextInt();
if(((ch=='m' || ch=='M') && age>=21) || ((ch=='f' || ch=='F') && age>=18))
{
 System.out.println("Eligible to get married");
}
else
   System.out.println("Not Eligible to get married");

}
}
