public class RotateArray {
    public static void rotateArray(int [] arr,int n,int k){
       int[] res=new int[n];
        for(int i=0;i<n;i++){
           int j =(i+k)%n;
           
           res[j]=arr[i];

        }

       for(int i:res){
          System.out.print(i);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=12;
         rotateArray(arr,arr.length,k);
        
    }
    
}
