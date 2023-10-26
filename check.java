import java.util.*;
public class check {
    /*public static int binarysearch(int numbers[], int key){
        int start =0, end = numbers.length -1;
        
        while(start<=end){
          int mid = (start + end )/2;
          if( numbers[mid]==key){ //found condition
            return mid;
          }
          else if(numbers[mid]<key){//right
               start=mid+1;
          }
          else{ //left
            end=mid-1;
          }
        
         
        }
        return -1;
      }*/

     /*  public  static void reverseofanarray(int number[]){
        int start =0;
         int end =number.length-1;
         while(start<end){
          int temp = number[start];
          number[start]=number[end];
          number[end]=temp;
          start ++;
          end--;


         }

      }*/
     /* public static void printpair( int array[]){
        int  tp =0;
        
for(int i=0; i<array.length ; i++){
int curr = array[i];
  for(int j=i+1 ; j<array.length ; j++){
    System.out.print("("+curr +" "+ array[j]+")" );
    tp++;
  }
  
  System.out.println();
} System.out.println("total pairs = "+tp);
      }
*/  
 /*public static void subarray( int array[]){
  for(int i = 0 ; i<array.length ; i++){
    int start = i ;
    for( int j = i ; j<array.length ; j++){
      int end = j;
      for( int k = start ; k<=end ; k++){
        System.out.print( array[k]+" ");
      }
      System.out.println();
    }
  System.out.println();
 }
}*/
/*public static void maxsubsum(int numbers[]){
  int currsum =0;
  int maxsum = Integer.MIN_VALUE;
  for( int i=0 ; i<numbers.length ; i++){
    int start= i ;
    for( int j = i ; j<numbers.length ; j++){
      int end = j;
      currsum =0;
      for( int k = start ; k<end ; k++){
        currsum += numbers[k];
      }
      System.out.println(currsum);
      if(maxsum<currsum){
        maxsum = currsum;
      }
    }
  }
  System.out.println("max sum =" +maxsum);
}*/ 
//this one is complex  with time so  we need a better way known as prefix array sum .
//in this we make an array and store the  sum of ith index
// #KADANES ARRAY
//{SPECIAL CASE  OF KADANES THAT ALL NO ARE NEGETIVE SO THE SUM WILL WE 0}
//where you see negative replace it with 0; 
// public static void kadanes( int num[]){
//   int  ms= Integer.MIN_VALUE;
//   int cs = 0;
//   for( int i = 0 ; i<num.length ; i++){
//     cs = cs+num[i];
//     if(cs<0){
       
//       cs=0;
//     }
  
//     ms = Math.max(cs, ms);
//   }
//   System.out.println( " our max subarray sum is:"+ms);
// }
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
// public static int trappedrainwater( int height[]){
// int n = height.length;
// //calculate left max boundary 
// int leftmax[] = new int [n];                        // ek auxillary array banaya h max k 
// leftmax[0]=height[0];                               //most left wale pe 0 ayega water esiliye 
// for(int i =1 ; i<n ; i++){                          //loop for travelling the whole height
//   leftmax[i] = Math.max(height[i],leftmax[i-1]);    // storing the max value of height or the own no .
// }
// //calculate right max boundary
// int rightmax[] = new int[n];                         //auxillary for min
// rightmax[n-1]= height[n-1];                           //starting form the last ,last wale pe 0 hoga water
// for(int i =n-2 ;  i>=0  ;i--){                        //loop  travelling in height array
//   rightmax[i]=Math.max(height[i],rightmax[i+1]);      //storing max of two i and right max
// }
// int trappedwater=0;                                 //initialise water from 0;
// //loop
// for(int i= 0 ; i<n ; i++){                          //loop to travel in  array
//   //water level = min leftmax boundary ,right max boundary
//   int waterlevel = Math.min(leftmax[i],rightmax[i]);        // nikalo left max or right max
//   //trapped water = wl-h[i]                     
//   trappedwater +=waterlevel -height[i];                 //use formula for that
// }
// return trappedwater;                                   //return water

// }
// public static int buyingprice(int price[]){
//   int buyprice =Integer.MAX_VALUE;
// int maxprofit = 0;
// for( int i=0 ; i<price.length ; i++){
//   if(buyprice<price[i]){ //profit
//   int profit = price[i]-buyprice ;
//    maxprofit = Math.max(maxprofit, profit)  ;
//    System.out.print(profit+" ");


// } else{
//   buyprice = price[i];
// }

// } return maxprofit ;
// } 
 



//tapping ran water

      public static void main(String arg[]){
      /*  int numbers[] = { 1,2,3,4,5,6,7,8,9};
         int key = 11;
         System.out.println("index for key is  " +binarysearch(numbers, key));
*/
   /*  int number[] = {12,45,67,98,34,6,45,3,67};
         reverseofanarray(number);
    for(int i=0; i<=number.length;i++){
    System.out.print(number[i] + " ");
    }
         System.out.println("");*/
      //  int array[]= {2,3,4,5,6,7,8,9};
      //  printpair(array);
   /*     int array[] ={ 1,2,3,4,5,6,7,8,9};
        subarray( array);
  */   
/*int numbers [] = {1,2,3,4,5,6,7};
maxsubsum(numbers);

*/
//int num[] = { 1,2,3,-1,10,20 };
//kadanes(num);
// int height[] = {4,2,0,6,3,2,5};
// System.out.println(trappedrainwater(height));
// int price[] = {7,1,5,3,6,4};
 //System.out.println("max prifit is  :" +buyingprice(price));
}
}
