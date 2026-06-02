package recursion;

public class onetoN {
    public static void num(int number,int n){
       
        if(number>n){

            return;

        }else{
            System.out.println(number);
            num(number+1,n);
        }
    }
    public static void main(String[] args) {
        num(1, 10);
    }
    
}
