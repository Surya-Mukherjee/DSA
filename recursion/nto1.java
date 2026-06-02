package recursion;

public class nto1 {
    public static void nums(int i,int n){
        if(i>n){
            return;
        }
        nums(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
         nums(1,4);
    }
}
