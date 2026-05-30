package patterns;

public class pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            for(int k=0;k<i*2;k++){
             System.out.print(" ");
            }
             for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int l=n;l>i;l--){
                System.out.print(" ");
            }
            for(int l=n;l>i;l--){
                System.out.print(" ");
            }
            for(int k =i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
