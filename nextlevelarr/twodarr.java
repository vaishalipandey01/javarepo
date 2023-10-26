package nextlevelarr;

import java.util.*;

 public class twodarr{
//     public static boolean Search(int matrix[][],int key){
//         int n = matrix.length , m = matrix[0].length ; //row or column 
//         for(int i=0; i<n;i++){
//             for(int j =0 ;j<m;j++){
//              if(matrix[i][j] == key){
//                 System.out.println("("+i+","+j+")");
//                    return true;
                
//              } 
             
//             }
//     }
//     System.out.println("cant find the index");
//              return false;

// }
//        public static void main(String args[]){
//         int matrix[][] = new int[4][4];
//          int n = matrix.length , m = matrix[0].length ; //row or column 
//          Scanner sc = new Scanner(System.in);

//          for(int i=0; i<n;i++){
//             for(int j =0 ;j<m;j++){
//                 System.out.println(" please enter elements of 2d array");
//                 matrix[i][j]= sc.nextInt();
//             }
//          }

//          //output
//          for(int i=0; i<n;i++){
//             for(int j =0 ;j<m;j++){
//                 System.out.print(matrix[i][j]+"");
//             }
//             System.out.println();
//        }

//  Search(matrix, 5);

// }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//SEARCH FOR THE LARGEST ELEMENT IN THE ARRAY REATURN ITS VALUE AND INDEX AS WELL
// public static  void  Searchforlargest(int matrix[][]){
//     int largest = Integer.MIN_VALUE;
//     int i ; int j;
//     int n = matrix.length ;
//      int m = matrix[0].length;
//     for( i=0 ; i<n ; i++){
//         for(j =0 ; j<m ; j++){
//             if(matrix[i][j]>largest){
//                 largest = matrix[i][j];
               
//             }
//         } 
//     }
//     System.out.println(largest);
    //return largest ;
//  System.out.print( " index is :" +"("+i+","+j+")");
      //       System.out.println("largest is :" +matrix[i][j]);

// }

//        public static void main(String args[]){
//         int matrix[][] = new int[3][3];
//          int n = matrix.length , m = matrix[0].length ; //row or column 
//          Scanner sc = new Scanner(System.in);

//          for(int i=0; i<n;i++){
            
//             for(int j =0 ;j<m;j++){
               
//                 matrix[i][j]= sc.nextInt();
//             }
//          }

//          //output
//          for(int i=0; i<n;i++){
//             for(int j =0 ;j<m;j++){
//                 System.out.print(matrix[i][j]+"");
//             }
//             System.out.println();
//        }
//  Searchforlargest(matrix);

// }
// }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
// public static void printspiralmatrix(int matrix[][]){
//     int startrow = 0;
//     int endcol = matrix[0].length-1;
//     int endrow = matrix.length-1;
//     int startcol = 0;

//     while(startrow<=endrow && startcol<=endcol){
//         //top
//         for(int j =startcol ; j<=endcol ; j++){
//             System.out.print(matrix[startrow][j]+" ");
//         }
//         //right
//         for(int i = startrow+1 ; i<=endrow ; i++){
//             System.out.print(matrix[i][endcol]+" ");
//         }
//         //bottom
//         for(int j = endcol-1 ; j>=startcol ; j--){
//             System.out.print(matrix[endrow][j]+ " ");
//         }
//         //left 
//         for(int i =endrow-1 ;i>=startrow+1 ; i--){
//             System.out.print(matrix[i][startcol]+ " ");
//         }
    
//     startcol++;
//     startrow++;
//     endcol--;
//     endrow--;
//     }

// } 
//brute force aproach thi //o(n^2)

// public static int diagonalsum( int matrix[][]){
//     int sum = 0 ;
//     for( int i =0 ; i<matrix.length; i++ ){
//         for( int j = 0 ; j<matrix[0].length ; j++){
//             if(i==j){
//           sum += matrix[i][j];
//             }
//             else if ( i+j==matrix.length-1){
//                 sum += matrix[i][j];
//             }
            
//         }
       
//     }
//      return sum;
// }
// for(int i =0 ; i<matrix.length ; i++){//o(n)
//     //pd
//     sum +=matrix[i][i];
//     //sd
//     if(i != matrix.length-1-i)
//     sum += matrix[i][matrix.length -i-1];
// }
// return sum ;
// }

// public static void main(String args[]){
//      int matrix[][] = {{1,2,3,4},
//                        {5,6,7,8},
//                        {9,10,11,12},
//                        {13,14,15,16}};
//                     //   printspiralmatrix(matrix);
    

// System.out.println(diagonalsum(matrix));

// }
// public static boolean staircasesearch(int matrix[][],int key){
//     int row =0 ,col = matrix[0].length-1; // its for starting purpose only from where to start;;;;
//       while(row<matrix.length && col>=0){// ki row last tk jayega or column km hota hota 0 tk ayega means starting pe travel karega 
//         if(matrix[row][col]==key){
//             System.out.println("found key at("+row+","+col+")");
//             return true;

//         }
//         else if (key<matrix[row][col]){
//             col--;

//         } else{
//             row++;
//         }
//       }
//       System.out.println("key not found at any index sorry vp!!");
//       return false;
// }
//  public static boolean staircasesearch(int matrix[][] , int key){
//     int row=matrix.length-1 , col=0;
//     while( row>=0 && col<=matrix[0].length-1){
//         if(key==matrix[row][col]){
//              System.out.println("found key at("+row+","+col+")");
//                 return true;
//             }
//         else if( key>matrix[row][col]){
//             col++;
//         }
//         else{
//             row--;
//         }

//     }
//      System.out.println("key not found at any index sorry vp!!");
//          return false;
//  }
// public static  void main(String args[]){
// int matrix[][] ={{10,20,30,40},
//                  {15,25,35,45},
//                  {27,29,37,48},
//                  {32,33,39,50}};
//  staircasesearch(matrix, 33);

//                 }
}
