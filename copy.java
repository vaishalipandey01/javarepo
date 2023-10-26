public class copy {
    // public static int binarysearch(int number[], int key){
    //     int start =0;
    //     int end = number.length - 1;
        
    //     while(start<=end){
    //       int mid = (start + end )/2;
    //       if( number[mid]==key){
    //         return mid;
    //       }
    //       if(number[mid]<key){
    //         start=mid+1;
    //       }
    //       else{
    //         end=mid-1;
    //       }
    //      return-1; 
    //     }
    //   }

    // public static void floydstriangle( int n ){
    //   int counter = 1; //no ko 1 se start krne k liye
    //    for(int i =1 ; i<=n ; i++){   //outer loop 
    //     for( int j =1 ; j<=i ; j++){ //inner loop 
    //       System.out.print(" "+counter);
    //       counter++; // no ko aage krne k liye
    //     }

       
    //    System.out.println(" ");
   // 1
   // 2 3
   // 3 4 5
   // 5 6 7 8
public static void pattern( int n ){
//  int count = j;
  for( int i =1 ; i<=n ; i++){
    for( int j =i ; j<=(i*2-1) ; j++ ){
      System.out.print(j);
      j++;
    }System.out.println();
  }
  }
 

      
  public static void main(String args[]){
// int number[] = { 34,67,90,6,8,3,6,7,89};
// int key = 6;
// System.out.println("index for key is "+binarysearch(number,key));}

//floydstriangle(4);
pattern(4);
}
}
