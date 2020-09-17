import java.util.Scanner;
class Marks{
 public static void main(String args[]){
 int n;
 float TotalMarks=0;
 Scanner sc =new Scanner(System.in);
 
 System.out.println("Enter no of subjects:");
 n=sc.nextInt();
 float SubjectMarks[]=new float[5];
 System.out.println("Enter marks: ");
 for(int i=0;i<n;i++)
 { 
  SubjectMarks[i]=sc.nextFloat();
  TotalMarks= TotalMarks + SubjectMarks[i];
 }
 float p=(TotalMarks/500)*100;
 System.out.println("percentage marks ="+p);
}
}
    