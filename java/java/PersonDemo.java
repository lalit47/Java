import java.util.Scanner;
class Person{
 public int age;
 public String name;
 Person(String b){
     this.age=18;
     this.name=b;

}
void show(){
System.out.println(age+" "+name);
}
}
class PersonDemo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String name=sc.nextLine();     
Person p=new Person(name);
p.show();
}
}
 
