import java.util.*;
public class string {
    // public static void printlatters(String str){
    //     for(int i=0 ; i<str.length(); i++){
    //         System.out.print(str.charAt(i)+" ");
    //     }
    //     System.out.println();
    // }
    // public static boolean ispalindrome(String word){
    //     for(int i=0 ; i<word.length()/2 ; i++){
    //     int n = word.length();
    //     if(word.charAt(i)!=word.charAt(n-1-i)){
    //         return false;
    //     }

    //     }
    //     return true ;
    //}
    //given a route 
    // public static int getshorestdist(String path){
    //     int x=0 ,y=0;
    //     for(int i=0 ; i<path.length(); i++){
    //         if(path.charAt(i)=='N'){
    //             y++;

    //         }
    //         else if(path.charAt(i)=='S'){
    //             y--;
    //         }
    //         else if(path.charAt(i)=='E'){
    //             x++;
    //         } else{
    //             x--;
    //         }
    //     }
    //     int x2=x*x;
    //     int y2 = y*y;
    //     return (int)Math.sqrt(x2+y2);
    // }
    // public static String subString(String str, int si ,int en){
    // String subst = " ";
    // for(int i = si ;i<en ; i++ ){
    //     subst = subst+str.charAt(i);
    // } return subst;
//}

   // public static void main(String args[]){
//         char arr[] ={'a','b','c','d'};
//         String str = "abcd";
//         String str2 = new String("xyz") ;
//     //Strings are IMMUTABLE - we cant change it we need to make a new  for new things 
    
//     Scanner sc = new Scanner(System.in);
 
//   String name = sc.nextLine();
//  System.out.println(name);   

// String str = "vashalipandey";
// printlatters(str);
//String word ="noon" ;
//ispalindrome(word);
//System.out.println(ispalindrome(word));
// String path = "WNEENESENNN";
// System.out.println(getshorestdist(path));
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
//***********************************************************8********** */
//this is called interning 
// String s1 = "vp";
// String s2 = "vp";
// String s3 =new String("vp");
// if(s1==s2){
//     System.out.println("equal");
// }else{
//     System.out.println(" not equal");
// };
//  if(s2==s3){ // not equal because they are pointing towards new space with new keyword 
//     System.out.println("equal");
//  }else{
//     System.out.println("not equal");
//  };
//  if(s2.equals(s3)){
//     System.out.println("equal");
//  }else{
//     System.out.println(" not equal");
// }
//SUBSTRING FUNCTION 
// String str = "vaishalipandey";
// System.out.println(subString(str, 0, 8));
// System.out.println(str.substring(0, 14));

// }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//COMPARED TO FUNCTIONS
// String fruit[] = {"mango","banana","apple"};
// String largest = fruit[0];
// for(int i =0 ;i<fruit.length ; i++){
//     if(largest.compareTo(fruit[i])<0){
// largest = fruit[i];
//     }
// } System.out.println(largest);
// StringBuilder sb = new StringBuilder("");
// for(  char ch = 'a'; ch<'z'; ch++){
//     sb.append(ch);
// }
// System.out.println(sb);
// String str = "hi i am vaishali pandey ";
// System.out.println(strtouppercase(str));
 //}
//  public static String compressthestr(String str){
//     String newstr = "";
//     for( int i =0 ; i<str.length(); i++){
//         Integer count = 1;
//         while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//             count++;
//             i++;
//         }
//         newstr += str.charAt(i);
//         if(count>1){
//             newstr += count.toString();
//         }
//     }
//     return newstr;
//  }
//  public static void main(String args[]){
//     String str = "abbcccdddd";
//     System.out.println(compressthestr(str));
//  }
// }