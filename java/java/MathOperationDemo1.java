import java.util.Scanner;
class MathOperation{
 static   int mult(int a,int b){
              return a*b;
   }
 //static float mult(float d,float e,float f){
    //          return d*e*f;
    //}
  static void show(int res){
           System.out.println(res);
   }
// static void show(float res){
    //       System.out.println(res);
  // }
}

class MathOperationDemo1{
public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int i=sc.nextInt();
       int j=sc.nextInt();
       int k=sc.nextInt();
       int m= MathOperation.mult(i,j);
    
    //   float n=MathOperation.mult(i,j,k);
       MathOperation.show(m);
       MathOperation.show(n);
}
}