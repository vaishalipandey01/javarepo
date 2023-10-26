import java.util.*;
public class functions {
//  public static int sum(int a , int b ){
//     int add = a+b ;
//     return add ;

     
// }


// public static int factorial( int n ){
//     int f = 1;
// for ( int i =1 ; i <=n ; i++){
//      f = i*f;
// }    
// return f ; 
// }

// //binomial cofficient 
// /*
//  * ncr = n!/ r!(n-r)!
//  */

// public static float binomial(int n , int r){
//     float bi = factorial(n)/(factorial(r)*factorial(n-r));
//     return bi;
// }
/*
 * NO IS PRIME OR PRINT ALL PRIME NOO BETWEEN THEM 
 */
//  public static int Prime(int n ){
//     for ( int i =2 ;i<=n ; i++){
//         if ( n%i==0){
//              System.out.println("not a prime");
//              break;
//         }
//         else{
//             System.out.println(" yes prime no ");
//         }
    
//     }
// return n ;
//  }
/* CODE TO CONVERT BINARY TO DECIMAL  */
// public static void bintodec( int binNum){
//     int pow = 0; // power ftn 
//     int deciNum = 0; //out put k liye
//     // int mynum = binNum; // input no 
//     while( binNum>0){
//         int lastdigit = binNum%10;
//         deciNum = deciNum+( lastdigit*(int)Math.pow(2 , pow)) ;
//     pow++;
//      binNum = binNum/10;
//     }
//     System.out.println( "decimal is " + deciNum);
//     } 
     /*
      * CODE TO CALCULATE DECIMAL NUMBER 
      */
    //  public static void dectobin(int n ){
    //     // int mynum =n ;
    //      int pow = 0;
    //      int binnum = 0;
    //      while( n>0){
    //          int rem = n%2;
    //          binnum = binnum+(rem*(int)Math.pow(10, pow));
    //          pow++;
    //          n=n/2;
    //      }
    //      System.out.println("bin form is " +binnum);
    //     }
   
    
    /*
     * scopes are of three types 
     * 1. method scope -> ftn k andr hi variable  ko use kr skte  h 
     * 2. block scope -> block k ander hi use kr skte h 
     * 3. class scope -> with the help of access modifiers ->> private , public , protected ;
     */
/*
 * ADVANCE PATTERNS
 *     * * * * *
 *     *       *
 *     *       *
 *     * * * * * 
 */
    //   public static void pattern( int r , int c ){
    //     for ( int i = 1 ; i<=r ; i++){
    //          for ( int j = 1 ; j<=c; j++){
    //             if( i==1 || i==r || j==1 || j==c){
    //                 System.out.print("*");

    //             }
    //             else {
    //                 System.out.print( " ");
    //             }
    //          }
    //          System.out.println();
    //     }
        
    //   }   

    /*
              *
             **
            ***
           ****
     
     // CODE FOR HALF INVERTED ROTATED PYRAMIDE PATTERN ;
     
           */
    //    public static void halfpy(int n ){
    //     for ( int i =1 ; i<=n;i++){
    //         for( int j =1 ; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //      for( int j=1 ; j<=i ; j++){
    //         System.out.print("*");
    //      }
    //         System.out.println();
    //         }
    //     }
               
       /* 
        * 12345
          1234
          123
          12
          1
        */
   //      public static void invertedhalfpy(int n){
   //     for(int i = 1 ; i<=n ; i++){
   //       for( int j =1 ; j<=(n+1-i) ; j++){
   //          System.out.print(j);
   //       }
   //       System.out.println("");
   //    }
   // }

/* FLOYDS TRIANGLE
 * 1
 * 23
 * 456
 * 78910
 * 111213141516
 */

// public static void floyd(int n ){
//    int no =1;
//    for(int i =1 ; i<=n ; i++){
//       for( int j = 1 ; j<=i ; j++){
//          System.out.print(" "+no );
//          no++;
//       }
//       System.out.println("");
//    }
// }

/*0 and 1 triangle 
 *1
  01
  101
  0101
  10101 
 
 */
// public static void triangle( int n){
//    for(int i =1; i<=n ; i++){
//       for( int j =1; j<=i ; j++){
//          if((i+j)%2==0){
//             System.out.print("1");
//          }else{
//             System.out.print("0");
//          }
//       }
//       System.out.println("");
//    }

// }
/*   
 * solid rhombus 
 *    ----****
 *    ---****-
 *    --****--
 *    -****---
 *    ****----
 */
// public static void rhombus(int n){
//    //ROW
   
//    for( int i=1; i<=n ; i++){
//     //space
//     for( int j = 1 ; j<=n-i; j++){
//       System.out.print(" ");}
//       // star after space
//       for( int j =1; j<=n; j++)
//          System.out.print("*");
//     System.out.println();
      
    

   
//     }
   
//    }
    /*
     * hollow rhombus
     
      *****
     *   *
    *   *
   *   *   
  *****  
*/
   // public static void hollowrhombus(int r , int c){
      
   //    for( int i =1; i<=r ; i++){      //row 
   //       for( int j =1 ; j<=c; j++){      //col move
   //       if(i==1||i==r || j==1|| j==c){    // condtn for star in col
   //          System.out.print( "*");
   //       }else{
   //          System.out.print(" ");
   //       }
         
         
   //    }System.out.println();
   //    }
   // }
         // public static void  butterfly(int n ){
         //     for ( int i = 1 ; i<=n; i++ ){
         //       //star
         //       for( int j =1 ; j<=i ; j++){
         //          System.out.print("*");

         //       }
         //       //space
         //       int spaces=2*(n-i);
         //       for(int j=1 ; j<=spaces ; j++){
         //          System.out.print( " ");
         //       }
         //       for( int j =1 ; j<=i ; j++){
         //          System.out.print("*");
         //       }
         //       System.out.println();
         //     }
         //     for( int i=n ; i>=1 ; i--){
         //       for( int j =1 ; j<=i ; j++){

               
         //       System.out.print("*");
         //     }
         //      int spaces = 2*(n-i);
         //      for( int j=1 ; j<=spaces ; j++){
         //       System.out.print(" ");
               
         //      }
         //      for( int j=1; j<=i ; j++){
         //       System.out.print("*");
         //      }
         //      System.out.println();
         //    }
         // }
 

    public static void main(String args[]){
        // System.out.println(sum(3,6));
        // System.out.println(sum(19 , 100));
        /* 
         * FORMAL PARAMETER ,ACTUAL PARAMETER
         * formal parameter -  are thode which are passed in ftn  and recieves arguments ; int add ( int a , int b)
         * actual parameter - are those which are passed during ftn call ; int add ( 3, 5)
      call by reference - modifiy real value ex pointers
      call by value - no modification in the original one only copy is passed ;
         */

//     }
    
// }
/*CALCULATE THE FACTORIAL OF N  */
//BY USING RECCURSION FUNCTION WE CAN DO IT ;
//int fact = n;

// System.out.println(factorial(30));

// System.out.print( binomial(10, 2));


// System.out.println(Prime(10));
//     }
// }  

// bintodec(101);
//     }
// }

//dectobin(2);
// pattern(6,6);
//  halfpy(4);

// invertedhalfpy(5);
// }
// }
// 
// triangle(5);
//    }
//}
// rhombus(10);
//     }
//    }
//hollowrhombus( 7,7);
//butterfly(21);    
}
   }