package patterns;

public class pattern1 {
    public static void main(String[] args){
        int n=4;
        for(int i=n;i>=0;i--){
            for(int j=1;j<=(n-i)+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
