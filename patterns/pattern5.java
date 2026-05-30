//my code
// package patterns;

// public class pattern5 {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
           
//             for(int j=1;j<=i;j++){
//                  if(i%2==0 && j==1){
//                     System.out.print(0);
//                     continue;
//                  }
//                  if(i%2!=0 && j%2==0){
//                     System.out.print(0);
//                     continue;
//                  }else if(i%2==0 && j%2!=0){
//                     System.out.print(0);
                    
//                  }
//                  else{
//                     System.out.print(1);
//                  }
             
//             }
//             System.out.println();
//         }
//     }
    
// }
package patterns;
public class pattern5 {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {

                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
}