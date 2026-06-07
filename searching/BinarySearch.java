package searching;

public class BinarySearch {
    public static void Search(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                System.out.println("taget found at"+mid);
                return;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println("target not found ");
    }
    public static void main(String[] args) {
        
        int[]arr={1,2,3,4,5,6};
        int target=6;
        Search(arr, target);
    }
}
