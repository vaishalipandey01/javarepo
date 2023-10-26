import java.util.*;
class Solution {
    public static void twoadd(int nums[],int target){
        for(int i =0 ; i<nums.length ; i++){
            int current = nums[i];
           for(int j =i+1 ; j<nums.length ; j++){
                  if(nums[i]+nums[j]==target){
                      System.out.println("["+i +","+j+ "]");
                  }else{
                      System.out.print("");
                  }            }
        }
    }
       public static void main(String args[]){
           int nums[] = { 3,2,4};
           twoadd(nums,6);
       } 
        
    }
