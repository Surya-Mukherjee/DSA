package patterns;

public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
       
      
        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                int c=ch+i;
                char ch1=(char)c;
             System.out.print(ch1);
            }
            System.out.println();
        }

    }
    
}
