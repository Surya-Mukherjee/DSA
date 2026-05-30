package patterns;

public class pattern12 {
    public static void main(String[] args) {
        int space =0;
        int n=9;
       for(int i=0;i<n/2;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
          for(int k=n;k>2*i+1;k--){
            System.out.print(" ");
          }
       for(int j=0;j<=i;j++){
            System.out.print("*");
        }
       
        System.out.println();
       }
       
       for(int i=n/2;i>=0;i--){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
         for(int k=0;k<space;k++){
            System.out.print(" ");
         }
          for(int j=0;j<=i;j++){
            System.out.print("*");
        }
         
         space=space+2;
        System.out.println();   
       }
       
       
    }
    
}
