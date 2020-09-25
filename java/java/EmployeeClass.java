class Person{
   Person(){
           System.out.println("I am first");
           }
}
class Employee extends Person{
    Employee(){
             System.out.println("I am second");
             } 
}      
class EmployeeClass{
        public static void main(String args[]){
        Employee e=new Employee();
}
}        
        