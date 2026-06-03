//nlogn solution 
// import java.util.*;
// public class majorityElement {
//     public static  int majorityElement(int[] nums){
//         int len= nums.length;
//         int n= (int)Math.floor(len/2);
//         int  count=0;
//         Arrays.sort(nums);
//         int i=nums[0];
//         return nums[n/2];
//         }
//     }
    
//O(n)solution
public class majorityElement{

    public static int majorityElement1(int[] nums){
        int n=nums.length/2;
        int candidate=nums[0];
        int count=1;
        int verifyCount=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==candidate){
                count++;

            }else if(count==0) {
                candidate=nums[i];
                count=1;
            }else{
                count--;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(candidate==nums[k]){
                verifyCount++;
            }
            if(verifyCount>n){
                return candidate;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,1,1,1,2,2};
        int res =majorityElement1(a);
        System.out.println(res);
    }
}
