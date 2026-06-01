
//BRUTE FORCE
// public class Medianoftwoelements {
//      public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//             int len1=nums1.length;
//             int len2=nums2.length;
//             double [] arr=new double[len1+len2];
//             System.out.println(len1+len2);
//             int k=0;
//             int i=0;
//             int j=0;
//             while(i<len1 && j<len2 ){
//                 if(nums1[i]<nums2[j]){
//                     arr[k]=nums1[i];
//                     i++;
//                     k++;
//                 }
//                 else{
//                     arr[k]=nums2[j];
//                     j++;
//                     k++;
//                 }
            
//             }
//             while(i<len1){
//                 arr[k]=nums1[i];
//                 i++;
//                 k++;
//             }
//             while(j<len2){
//                 arr[k]=nums2[j];
//                 j++;
//                 k++;
//             }
//             if(arr.length%2==1){
//                 return arr[arr.length/2];
//             }else{
//                 int mid = arr.length / 2;
//                 return (arr[mid-1]+arr[mid])/2;
//             }
           
//          }
//     public static void main(String[] args) {
//         int[] n={1,2};
//         int []m={100,200};
//         double k=findMedianSortedArrays(n,m);
//         System.out.println(k);
//     }
    
// }

class Medianoftwoelements{
    public static double mediantwosortedarray(int[] nums1,int[] nums2){
        if(nums1.length>nums2.length){
            return mediantwosortedarray(nums2, nums1);
        }
        int m=nums1.length;
        int n=nums2.length;
        int low=0;
        int high=m;
        while(low<=high){
             int midx= (low+high)/2;
             int midy=(m+n+1)/2-midx;
             int maxleftX=(midx==0)?Integer.MIN_VALUE:nums1[midx-1];
             int minrightX=(midx==m)?Integer.MAX_VALUE:nums1[midx];
             int maxleftY=(midy==0)?Integer.MIN_VALUE:nums2[midy-1];
             int minrightY=(midy==n)?Integer.MAX_VALUE:nums2[midy];
             if(maxleftX<=minrightY && maxleftY<=minrightX){
                if((m+n)%2==0){
                    return (Math.max(maxleftX,maxleftY) +Math.min(minrightY, minrightY))/2;
                }else{
                    return Math.max(maxleftX, maxleftY);
                }
             }else if(maxleftX>=minrightY){
                high=midx-1;
             }else{
                low=midx+1;
             }
        }
        return 0;
    }
    public static void main(String[] args) {
         int[]a={1,2};
         int[] b={3,4,5,6,7,8};
         double result=mediantwosortedarray(a, b);
         System.out.println(result);
    }
}