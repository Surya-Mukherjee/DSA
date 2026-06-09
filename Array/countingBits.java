public class countingBits {
    public static int[] bits(int n){
        int [] nums=new int[n+1];
        int bit;
        int rem;
      
        for(int i=0;i<n+1;i++){
            int count=0;
            if(i==0){
                nums[i]=0;

            }
            bit=i;
            while(bit!=0){
                rem=bit%2;
                if(rem==1){
                    count++;
                }
                bit=bit/2;

            }
            nums[i]=count;
        }
        return nums;
    }
 public static void main(String[] args) {
    int n=100 ;
    int [] res=bits(n);
    for(int k:res){
        System.out.print(k);
    }
 }
}
