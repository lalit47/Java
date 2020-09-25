import java.util.Scanner;
class Count1Darray{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter row");
int row=sc.nextInt();
int arr[][]=new int[row][];
for(int i=0;i<arr.length;i++){
System.out.print("enter column:");
int col=sc.nextInt();
arr[i]=new int[col];
System.out.println("enter"+col+" elements in row"+i);
for(int j=0;j<arr[i].length;j++);
{
 int arr[i][j]=sc.nextInt();
}
}
for(int ar[]:arr)
{
  for(int k:ar){
   System.out.print(k);
}
System.out.println();
}
int d1=arr.length;
for(int i=0;i<arr.length;i++){
int count=0;
for(int j=0;j<arr[i].length;j++){
count++;
}
}
}
}

