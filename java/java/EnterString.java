import java.util.Scanner;
class EnterString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of names:");
int n=sc.nextInt();
String arr[]=new String[n];
System.out.println("Enter the names");
sc.nextLine();
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextLine();
}
for(int i=0;i<n;i++)
{
   System.out.println("names:"+arr[i]);
}
}
}


