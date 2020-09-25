import java.util.Scanner;
abstract class Processor{
    int data;
    abstract void process();
    void showData(){
    System.out.println("Factorial ="+data);
    }
   
}
class Factorial extends Processor{
    void process(){
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           while(n>1){
             int data=n*n-1;
             int i=i+1;
           } 
    void showData(){
    System.out.println("Factorial ="+data);
    }
    
}
}

class ProcessDemo{
 public static void main(String args[]){
      Factorial f=new Factorial();
      f.process();
      f.showData();
}
}



           