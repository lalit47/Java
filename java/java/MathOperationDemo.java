import java.util.Scanner;
class MathOperation{
 static int add(int a,int b){
              return a+b;   }
 static int sub(int a,int b){
              return a-b;      
                   }
 static int mult(int a,int b){
            return a*b;      
                   }
 static int pow(int a,int b){
             return pow(a,b);       
               }

static  void show(int res){
           System.out.println(res);
}
}

class MathOperationDemo{
public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int c=sc.nextInt();
       int d=sc.nextInt();
       int i= MathOperation.add(c,d);
       int j=MathOperation.sub(c,d);
       int k=MathOperation.mult(c,d);
       int l= MathOperation.pow(c,d);
       MathOperation.show(i);
       MathOperation.show(j);
       MathOperation.show(k);
       MathOperation.show(l);
}
}