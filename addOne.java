import java.util.ArrayList;

import java.util.Collections;

class solution{
    ArrayList<Integer>addOne(int[]arr){

        ArrayList<Integer> result= new ArrayList<>();
        int n= arr.length;//3
        int carry=1;
        int ans;
       for(int i=n-1;i>=0;i--){//i=2,i=1,i=0
        if(arr[i]==9){//[i]==9
            
         ans=(arr[i]+carry)%10;//9+1=10%10=0,9+1=10%10=09+1=10%10=0
         result.add(ans);//result=[000]
         if(i==0){
            
            carry=1;
            result.add(carry);//result=[0001]
         }
         
         
            
        }else{
            ans=arr[i]+carry;
        result.add(ans);
        carry=0;
        }
        
        
       }
       Collections.reverse(result);
        return result;//result=[1000]

    }
}
public class addOne {
    public static void main(String[] args){
        solution nc=new solution();
        int[] arr= {788};
        ArrayList<Integer> res=nc.addOne(arr);
        System.out.println(res);
    }
}
