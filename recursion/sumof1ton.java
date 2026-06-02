package recursion;

public class sumof1ton{
 public static void sum(int i,int sum){
     if(i<1){
        System.out.println(sum);
        return;
     }
     sum(i-1,sum+i);
 }    
 public static void main(String[] args) {
    sum(4,0);
 }
}