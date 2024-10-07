//class A{
////    int weight=10;
//
//}
//
//class B extends A{
////     int weight = 20;
//     B(){
//         System.out.println(super.weight);
//     }
//
//}
//public class oop3 {
//    public static void main(String[] args) {
//        B b1 = new B();
//    }
//}

class Shapes{

    int i=10;

     static void area(){
        System.out.println("im in shapes");
    }
}
class Circle extends Shapes{
//    @Override
    int i=20;
//    @override
//@Override
      void area(){
        System.out.println("im in circle");
    }
}
public class oop3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area();
        System.out.println(c1.i);

    }
}
