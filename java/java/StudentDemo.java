class Student{
       private int rollNo;
       private String Sname;
       
   void setData(int roll,String name){
        rollNo=roll;
        Sname=name;
   }
     
   void showData(){
   System.out.println(rollNo+" "+Sname);
   }     
}
class StudentDemo{
  public static void main(String args[]){
     Student s=new Student();
     s.setData(100,"rahul");
     s.showData();
}
}