import java.util.Scanner;
class Search{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
}

System.out.println("Original Array:");
  for(int i=0;i<n;i++){
    System.out.println(arr[i]);
   }
int s=sc.nextInt();
for(int i=0;i<n;i++)
 {
    if(s==arr[i])
    {
     System.out.print("Searched element is"+arr[i]);
     break;
     }
     else
    {
      System.out.println("Element does not exist in the array");
      break; 
    }
}
}
}