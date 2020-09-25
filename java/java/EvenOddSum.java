import java.util.Scanner;
class EvenOddSum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter size of array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements in the array:");
for(int i=0;i<n;i++)
{
  arr[i]=sc.nextInt();
}
 
int esum=0;
int osum=0;
 for(int j=0;j<n;j++)
{
  if((arr[j]%2)==0)
     esum=esum+arr[j];
}
for(int j=0;j<n;j++)
{
 if((arr[j]%2)!=0)
  osum=osum+arr[j];
}
System.out.println("Even sum:"+esum);
System.out.println("Odd sum:"+osum);
}
}
