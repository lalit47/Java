import java.util.Scanner;
class Array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 10 numbers :");
int arr[]=new int[10];
int i=0;
int sum=0;
for(i=0;i<arr.length;i++){
   arr[i]=sc.nextInt();
}

for(int a:arr){
  sum=sum+ a;
}
  System.out.println("Sum = "+sum);
  System.out.println("Average = "+sum/10);
}
}

