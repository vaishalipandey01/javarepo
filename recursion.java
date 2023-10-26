public class recursion {
// public static void printinc(int n ){
//     if(n==10){
//         System.out.println(n);
//         return ;
//     }
// System.out.println(n+" ");
// printinc(n+1);
// }  

// public static void main(String args[]){
// printinc(1);
// }


// public static int factorial(int n ){
//     if(n==0){
        
//         return  1;
//     }
//     int ftnm1 = factorial(n-1);
//     int fac = n*factorial(n-1);
//     return fac ;


    
// }
// public static void main(String args[]){
//     factorial(4);
//     System.out.println(factorial(5));
// }
// }
// public static int sumofnaturalno(int n ){
//     if( n==1){
//         return 0;
//     }

//     int sumpre = n;
//     int sum = n+sumofnaturalno(n-1);
//     return sum;

// }
// public static void main(String  args[]){
//     System.out.println(sumofnaturalno(5));
// }
// }
// public static int fibonacci(int n){
//     if(n==0 ){
//         return n;

//     }
//     if(n==1){
//         return n;
//     }
//  int fibnm1= fibonacci(n-1);
//  int fibnm2 = fibonacci(n-2);
//  int fab = fibnm1 +fibnm2;
 
//  return fab;

// }
// public static void main(String args[]){
//   System.out.println(fibonacci(20));   
// }
// }
// public static boolean issorted(int arr[], int  i){
//     if( i==arr.length-1){
//         return true;
//     }
//     if(arr[i]>arr[i+1]){
//         return false;

//     }
//     return issorted(arr, i+1);

// }
// public static void main(String args[]){
//     int arr[] = {1,2,3,4,1,5,8,9};
//     System.out.println(issorted(arr,0 ));
// }
// }
// public static int firstocc( int arr[], int key,int i ){
//     if(i==arr.length-1){
//         System.out.println(" cant found the key in any index");
//         return -1;

//     }
//     if(key==arr[i]){
//        // System.out.println(i);
//         return i ;
//     }
//     return firstocc(arr, key, i+1);
// }
// public static void main(String args[]){
//     int arr[] = {8,3,6,9,5,10,2,5,3};
//     System.out.println(firstocc(arr,5, 0));
// }
// }
// public static int lastocc( int arr[], int key,int i ){
//     if(i==arr.length ){
       
//         return -1;

//     }
//     int isfound = lastocc(arr, key, i+1);
//     if(isfound== -1 && arr[i]==key){
//         return i;
//     }
//     return isfound;
// }
// public static void main(String args[]){
//     int arr[] = {8,3,6,9,5,10,2,5,3};
//     System.out.println(lastocc(arr,5, 0));
// }
// }
// public static int power(int x,int n){
//   if(n==0){
//     return 1;
//   }    
// //   int smaller = power(x, n-1);
// //   int total = smaller*x;
// //   return total;
// return x*power(x, n-1);

// }
// public static void main(String args[]){
//   System.out.println(  power(2,10));
// }
// }
// public static int oppower(int a,int n){
// if(n==0){
//   return 1;
 
// }
// int half = oppower(a, n/2)*oppower(a, n/2);

// //n is odd 
// if(n%2!=0){
//   half = a*half;
// }
// return half;
// }
// public static void main(String args[]){
//   System.out.println(oppower(2, 10));
// }
// }
// optimized one by storing the  daa in variable ;
// public static int oppower(int a,int n){
// if(n==0){
//   return 1;
 
// }
// int vari = oppower(a, n/2);

// int half = vari*vari;

// //n is odd 
// if(n%2!=0){
//   half = a*half;
// }
// return half;
// }
// public static void main(String args[]){
//   System.out.println(oppower(2, 10));
// }
// }
// public static int tilingproblem(int n ){
//     if(n==0 || n==1){
//         return 1;
//     }
//     int fnm1 =  tilingproblem(n-1); // vertical 
//     int  fnm2 = tilingproblem(n-2); //horizontal 
//     int total = fnm1 + fnm2;
//     return total;
//  }
//  public static void main(String args[]){
//     System.out.println(tilingproblem(4));
//  }} 
// public static void removeduplicate(String str, int idx, StringBuilder newstr, boolean  map[]){
//   if(idx==str.length()){
//     System.out.println(newstr);
//     return ;

//   }  
//   char currchar = str.charAt(idx);
//   if(map[currchar -'a']==true){
//     //dopplicate
//     removeduplicate(str, idx+1, newstr, map);

//   }else{
//     map[currchar-'a']=true;
//     removeduplicate(str, idx+1, newstr.append(currchar), map);
//   }
// }
//   public static void main(String args[]){
//     String str = "appnnacollege";
//     removeduplicate(str, 0,new StringBuilder(""),new boolean[26]);

//   }

// }
public static void printbinString( int n , int lastplace , String str){
    if(n==0){
        System.out.println(str);
        return ;
    }
 printbinString(n-1, 0, str+"0");
 if(lastplace==0){
    printbinString(n-1, 1, str+"1");
 }
    }

public static void main(String args[]){
    printbinString(3, 0, (""));
}}













