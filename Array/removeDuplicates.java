public class removeDuplicates {
    public int removeduplicate(int[] nums){
        int k=1;
        int j=1;
        while(j<nums.length){
             if(nums[k-1]!=nums[j]){
                nums[k]=nums[j];
                k++;
                j++;
             }else{
                j++;
             }
        }
        int i=0;
        while(i<k){
            System.out.println(nums[i]);
            i++;
        }
        return k;
    }
     
    
}
