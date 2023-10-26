import java.util.*;
public class bitmanipulation {
  //check if a no. is odd or even 
//   public static void oddeven(int n ) {
//     int bitmask = 1;
//     if((n & bitmask )== 0 ){
//         System.out.println("even");
//     }else{
//         System.out.println("odd");
//     }
//   } 
    
//   public static void main(String arg[]){
//     oddeven(3);
//     oddeven(11);
//     oddeven(55);
//     oddeven(0);
//   }
// GET ITH BIT OF THE NUMBER WE CAN USE 
// public static int getithbit(int n , int i ){
//     int bitmask = 1<<i;
//     if( (n & bitmask)==0){
//         return 0;
//     }else {
//         return 1;
//     }
// }
// public static void main(String args[]){
//    System.out.println( getithbit(5, 1));
//}
// public static int setithbit(int n ,int i){
//     int bitmask = 1<<i;
//     return n|bitmask;
// }
// 
// public static boolean ispowerof(int n ){
//     return (n&(n-1))==0;
// }
public static int countsetbits(int n ){
    int count = 0 ;
    while(n>0){
        if( (n&1)!=0){
            count++;

        }
       n= n>>1;
    }
    return count ; 
}
public static void main(String agrs[]){
  //  System.out.println(setithbit(10, 2));
  //System.out.println(clearithbit(10, 1));
//System.out.println(ispowerof(8));
System.out.println(countsetbits(10));
}
}
