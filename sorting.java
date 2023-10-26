//import java.util.*;
import java.util.Arrays ;
import java.util.Collections;
public class sorting {
    //##############################################################################################################################################
    //SORTING -BUBBLE SORT
    // public static  void bubblesort(int array[]){
    //     for(int i=0 ; i<array.length ; i++){
    //         for(  int j =0 ;j<array.length -1-i; j++){
    //             if( array[j]>array[j+1]){
    //                 //swap
    //                 int temp = array[j];
    //                 array[j]= array[j+1];
    //                 array[j+1]=temp;
                                                              //TIME COMPLPEXCITY IS N(O2);
                                                            // NOT GOOD BUT OKAY OKAY OR FORMS  A BASIC  OF THIS
    //             }
    //         }
    //     }
    //    for(int k=0 ; k<array.length ;k++){
    //     System.out.println(""+array[k]);
    //     }
    // }
    // public static void main (String arg[]){
    //     int array[] = { 5,4,1,3,2};
    //     bubblesort(array);

   // }
    
// }
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7&7
// public static void selectionsort ( int arr[]){
// for(int i=0 ; i<arr.length-1 ; i++){ //turns looop outer loop
//     int minpos = i;           //take current element as min 
//     for( int j = i+1 ; j<arr.length ; j++){ // inner loop for unsorted part
//         if( arr[minpos]> arr[j]){
//    minpos = j;
//         }
//     }
//          //swap in outer loop
//  int temp = arr[minpos];
//  arr[minpos] = arr[i];
//  arr[i]= temp;
        
    
// }


// }


//     }
// public static void insertionsort(int arr[]){
//     for(int i =1 ; i<arr.length; i++){
//         int current = arr[i];
//         int prev = i-1;
//         //while for getting position 
//         while(prev>=0 && arr[prev]> current){
//             arr[prev+1] =arr[prev]; // prev k aage push kr do qki hm peeche compare kr rahe h 
//              prev --;
//         }
//         //time for real in sertion
//         arr[prev+1]=current;
//     }
// }
public static void print(int arr[]){
    for( Integer i =0 ; i<arr.length ; i++){
        System.out.print(arr[i]);
    }
        System.out.println();
    
}
public static void countingsort(int arr[]){
    int range = Integer.MIN_VALUE;
    for(int i =0 ;i<arr.length ; i++){
        range = Math.max(range, arr[i]);
    }
 int count[] = new int[range+1];
 for(int i = 0 ; i<arr.length ; i++){
    count[arr[i]]++;}

    int j =0;
    for(int i =0; i<arr.length ; i++){
        while(count[i]>0){
            arr[j] = i;
            j++;
            count[i]--;
        
        }
    }
 }
        


public static void main ( String arg[]){
int arr[] = { 1,4,1,3,2,4,3,7};
//selectionsort(arr);
//insertionsort(arr);
//Arrays.sort(arr);
//print(arr);
//Arrays.sort(arr,0, 3);
//Arrays.sort(arr,Collections.reverseOrder());
countingsort(arr);
print(arr);
}
}
