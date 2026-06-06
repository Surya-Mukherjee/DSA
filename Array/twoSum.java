

public class twoSum {
    public static int[] twosum(int[] nums,int target) {
     int len=nums.length;
     int i=0;
     int j=len-1;
     int[] res = new int[2];
     while(true){
       
        if(nums[i]+nums[j]==target){
            res = new int[]{i,j};
            return res;
        }else{
            if(i!=j){
                j--;
            }
             if(i==j){
                j=len-1;
                i++;
            }
            if(j<i){
                System.exit(0);
            }
        }
     }
    }
    public static void main(String[]args){
     
        int[] arr={2,6,1,10};
        int target=4;
        int[] index=twosum(arr,target);
        for( int i:index){
            System.out.print(i);
        }
    }
    
}
