package recursion;

public class fivetimesname {
    public static void name(String name,int n){
        if(n>5){
            return;
        }
        System.out.println(name);
        name(name,n+1);
    }
    public static void main(String[] args) {
        name("Surya",1);
    }
    
}
