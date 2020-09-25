import java.util.Scanner;
class Arrays{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter rows:");
int r=sc.nextInt();
int arr[][]=new int[r][];
for(int i=0;i<arr.length;i++){
System.out.println("Enter cols:");
int c=sc.nextInt();
arr[i]=new int[c];
for(int j=0;j<arr[i].length;j++){
 System.out.println("Enter elements:");
 arr[i][j]=sc.nextInt();
int sum=sum+arr[i];
}
}

for(int ar[]:arr){
for(int a:ar){
System.out.print(a+" ");
}
System.out.println();
}
}
}