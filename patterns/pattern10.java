package patterns;

public class pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=0;j--){
                System.out.print((char)('E'-j));
            }
            System.out.println();
        }
    }
    
}
