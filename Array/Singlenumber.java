

public class Singlenumber {
    public static int Singlen(int [] nums){
      int res=0;
      for( int k:nums){
        res^=k;
      }
      return res;
    }
    
     public static void main(String[] args) {
        int a[]={4,1,2,1,2};
        int number=Singlen(a);
        System.out.println(number);
     }   
}
