import java.util.Scanner;
class Arrays{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of array:");
int r=sc.nextInt();
int arr[]=new int[r];
System.out.println("Enter elements:");
for(int i=0;i<arr.length;i++){

arr[i]=sc.nextInt();
}
int max=arr[0];
int min=arr[0];
for(int j=0;j<r;j++){
 for(int k=0;k<r;k++){
   if(arr[j]>max){
    int temp=max;
    max=arr[j];
    arr[j]=temp;
}
}
}
for(int j=0;j<r;j++){
 for(int k=0;k<r;k++){
   if(arr[j]<min){
    int temp=max;
    max=arr[j];
    arr[j]=temp;
}
}
}
System.out.println("largest element is "+max);
System.out.println("smallest element is "+min);
}
}