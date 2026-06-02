// public class sortColors {
//     public static void sortColor(int[] nums){
//         int i=0;
//         int j=0;
//         int count0=0;
//         int count1=0;
//         int count2=0;
//         while(i<nums.length){
//             if(nums[i]==0){
//                 count0++;
//                 i++;
//             }else if(nums[i]==1){
//                 count1++;
//                 i++;
//             }else{
//                 count2++;
//                 i++;
//             }



//         }
//           for(int k=0;k<count0;k++){
//             nums[k]=0;
//           }
//           for(int l=count0;l<count0+count1;l++){
//             nums[l]=1;
           
//           }
//           for(int m=count1+count0;m<count0+count1+count2;m++){
//             nums[m]=2;
//           }
//         for(int k:nums){
//             System.out.print(k);
//         }
//     }
//     public static void main(String[] args) {
//          int[]color={2,0,2,1,1,0};
//          sortColor(color);
//     }
// }


//optimal dutch national flag approach
public class sortColors{
    public static void swap(int[]n,int a,int b){
        int temp=n[a];
        n[a]=n[b];
        n[b]=temp;
    }
    public static void colors(int[]nums){
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }else if(nums[m]==1){
                m++;

            }else{
                swap(nums, m, h);
                h--;
            }
        }
    }
}