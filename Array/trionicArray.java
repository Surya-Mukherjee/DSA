public class trionicArray {
    public static boolean istriaonic(int[] nums){
        int n= nums.length;
        int i=1;
        while(i<n && nums[i-1]<nums[i]){
            i++;
        }
        int p=i-1;
        while(i<n && nums[i-1]>nums[i]){
            i++;
        }
        int q=i-1;
        while(i<n && nums[i-1]<nums[i]){
            i++;
        }
       int flag=i-1;
       return (p!=0) &&(q!=p) && (flag==n-1 && flag!=q);

    }
    public static void main(String[] args) {
        int a[]={4,5,7,2,1,8,9,10};
        boolean res=istriaonic(a);
        if(res){
            System.out.println("It is a trionic array");
        }else{
            System.out.println("Not a trionic array");
        }
    }
    
}
