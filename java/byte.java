import java.util.Scanner;
   class Byte{
      public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter two numbers :");
      byte a=sc.nextByte();
      byte b=sc.nextByte();
      byte sum=(byte)(a+b);
      System.out.println("sum = "+sum);
}
}