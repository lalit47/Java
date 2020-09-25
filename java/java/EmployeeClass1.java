class Person{
            void getDetails(){
                     System.out.println("Person class details");
                              }
             void getAddress(){
                      System.out.println("Person class Address");
                               }
}
class Employee extends Person{
            void getAddress(){
                     System.out.println("Employee class Address");
                              }
             void getDept(){
                       System.out.println("Employee class Department");
                            }
}

class EmployeeClass1{
            public static void main(String args[]){
            Person arr[]={new Employee(),new Person()};
                      for(Person a:arr){
                          if(a instanceof Employee){
                               Employee e=(Employee)a;
                               e.getDept();
                             }
                          }
}              }