public class missingnumber {
    public static int missingNumber(int[] nums){
        int n=nums.length;
        int actualSum=(n*(n+1))/2;
        int expectedSum=0;
        for(int i=0;i<n;i++){
            expectedSum+=nums[i];
        }
        int number=actualSum-expectedSum;
        return number; 
    }
    public static void main(String[] args) {
        int[] a={1,2,3,5};
        int res=missingNumber(a);
        System.out.println(res);
    }
    
}
