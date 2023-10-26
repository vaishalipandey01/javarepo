public class OOPS { 
   public static void main(String agr[]){    
   //    Calculator calc = new Calculator();
   // System.out.println(calc.sum(11,23));
   // System.out.println(calc.sum((float)1.5,(float)2.5));
   // System.out.println(calc.sum(1,2,3));
//   deer d = new deer();
//   d.eat();
//   Animal ani = new Animal();
//   ani.eat();
//     }
//    }
//    class Animal{
//       void eat(){
//          System.out.println("eats meat");
//       }
//    }
//    class deer extends Animal{
//       void eat(){
//          System.out.println("eats grass");
//       }
//    }
//    class Calculator{
//       int sum(int a , int b ){
//          return a+b;
//       }
//        float sum(float a, float b ){
//          return a+b;
//        }
//        int sum(int a , int b, int c){
//          return a+b+c;
//  Cow dizu = new Cow();
//  dizu.eat();
//  Horse  h = new Horse();
//  h.eat();
//  h.walk();
// //        }
//    }
// }
// abstract class Animal{
//    void eat(){
//       System.out.println("animal eats"); // inpimentation is written here 
//    }
//    abstract void walk();
// }
//  class Horse extends Animal{
//    void walk(){
//       System.out.println("walks very fast");
//    }
//  }
//  class Cow extends Animal{
//    void walk(){
//       System.out.println("walk on four legs ");


 

   //}
//}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

// Queen Q = new Queen();
// Q.moves();


//    }
// }
// interface Chessplayer {
//    void moves();
// }
//  class Queen implements Chessplayer{
//    public  void moves(){
//       System.out.println("up ,down,left , right ,diagonal(in all 4 directions)");
//    }
//  }
//    class Rook implements Chessplayer{
//    public  void moves(){
//       System.out.println("up ,down,left , right ");
//    }
//  }
//  class King implements Chessplayer{
//    public  void moves(){
//       System.out.println("up ,down,left , right , diagonal ( by 1 step)");

//***************************************************************** */
Bear b = new Bear();
b.eats();

   }
 }
 
 interface herbivore{
   void eats();
 }
 interface carnivors{
   void eats();
 }
 class Bear implements herbivore,carnivors{
  public void eats(){
   System.out.println(" grass and meat");
  }
 }