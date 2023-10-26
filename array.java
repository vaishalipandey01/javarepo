
import java.util.*;
public class array {
//ARRAY TIME
// int marks [] = new int[50];
// int numbers[] = { 12,56,67};
// String name[] = {"vaishali", " panda", "noogler"};
 //public static void enterbyloop(int name[]){

   //  for(int i =1 ;i<=name.length ;i++){
   //    System.out.println(name[i]);
     // name[i] = name[i]+3;

     // System.out.println(name[i]);
 //   }
//    for( int i =1 ; i<=name.length; i++){
//      name[i] = name[i]+3;
//       System.out.println(name[i]);
//    }
//  }


    //psvm
        //input in array
        
         
        //int marks[] = new int[13];
  //Scanner sc =new Scanner(System.in);
//   marks[0] = sc.nextInt();
//   marks[1] = sc.nextInt();
//   marks[3] = sc.nextInt();
 // marks[4] = 45;
//   marks[5] = sc.nextInt();
//   marks[6] = sc.nextInt();
//   marks[7] = sc.nextInt();
//   marks[8] = sc.nextInt();
//   marks[9] = sc.nextInt();
//   marks[10] = sc.nextInt();
//   marks[11] = sc.nextInt();
//   marks[12] = sc.nextInt();
//   for(int i=0 ; i<=marks.length ; i++){
//     System.out.println(marks[i]);
//   }

// marks[4] = 60;
// System.out.println(marks[4]); 
// marks[4]=marks[4]+1;
// System.out.println(marks[4]);
      
//System.out.println("lenght of array i s:" +marks.length);
// to update marks ;
// int name[] = new int[10];
// name[1]=1;
// name[2]=2;
// name[3]=3;
// name[4]=4;
// name[5]=5;
// name[6]=6;

// name[7]=7;
 

// enterbyloop(name);


//}
//}
//***************************************************************************************************************8 */
// public static int Linearsearch( int number[], int key){
 
//   for(int i =0 ; i<number.length; i++ ){
//     if( number[i]==key){
//        return i;
//      }
//   }
//   return -1;
 // FIND THE LARGEST OR SMALLEST NO IN THE ARRAY
 // -INFINITY -- integer.MIN-VALUE 
// + INFINITY --- Iinteger.MAX-VALUE
// they all the  contained in import java.util.*:
// public static int getlargest(int number[]){
//   int largest =Integer.MIN_VALUE ;
//   for( int i =0 ; i<number.length ; i++){
//     if( largest <number[i]){
//       largest = number[i];
//     }
//   }
//   return largest;
// }

// //}
// public static int getsmallest( int number[]){
//   int smallest = Integer.MAX_VALUE;
//   for( int i =0 ; i<number.length ; i++){
//     if(smallest > number[i]){
//        smallest = number[i];

//     }
//   }
//   return smallest;
// }
/******************************************************************************************** */
//BINARY SEARCHHHH
//the time complexity of binary search is log2n
// public static int binarysearch(int numbers[], int key){
//   int start =0, end = numbers.length -1;
  
//   while(start<=end){
//     int mid = (start + end )/2;
//     if( numbers[mid]==key){ //found condition
//       return mid;
//     }
//     if(numbers[mid]<key){//right
//          start=mid+1;
//     }
//     else{ //left
//       end=mid-1;
//     }
  
   
//   }
//   return -1;
// }
//  /*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ */
//  //REVERSE OF AN ARRAY
//  public static void reverse(int number[]){
//   int first = 0;
//   int last = number.length-1;
// while(first<last){
//   //swap 
//   int temp = number[last];
//   number[last]= number[first];
//   number[first]=temp;
//   first++;
//   last--;
// }
//  }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2@22
     

public static void main(String args[]){
//linear search 
//find the index of an element in a given array ;

// int numbers[] = { 34,67,90,6,8,3,6,7,89};
// int key = 6;
// System.out.println("index for key is" +binarysearch(numbers, key));
// // //learsearch(numbers, 6);
// // int index = Linearsearch(number,key);
// //   if(index==-1){
// //     System.out.println( " index not found");
// //   }else{ 
// //     System.out.println( " key found at index "+index);
// //   }
// // }

// // }
// System.out.println( " largest value is "+ getlargest(number));
// System.out.println( " smallest value is " + getsmallest(number));
/*********************************************************************************************************************8 */
int number[]={1,2,3,4,5,6,7,8,9,10};
reverse(number);
for(int i=0;i<number.length ; i++){
  System.out.print(number[i]+" ");  //for printing elements of the array which is reversed
}
System.out.println();


}}