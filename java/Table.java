import java.util.Scanner;
class Table{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i;
int product[]=new int[11];
for(i=1;i<product.length;i++)
{
  product[i]=num*i;
  System.out.println(num+" X "+i+" = "+product[i]);
}

}
}
