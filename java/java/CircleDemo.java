class Circle{
       private double radius;
       private double Area;
       
   void init(double r){
        radius=r;
   }
   double calculateArea()
      {
        Area=3.14*radius*radius;
        return Area;
       }
   
     
   void display(){
   System.out.println(Area);
   }     
}
class CircleDemo{
  public static void main(String args[]){
     Circle c=new Circle();
     c.init(2.5);
     c.calculateArea();
     c.display();
}
}