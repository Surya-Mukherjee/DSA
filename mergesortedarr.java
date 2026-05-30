
import java.util.*;
public class mergesortedarr{
 public static  ArrayList<Integer> merge(int []a ,int[]b){
    ArrayList<Integer> res= new ArrayList<>();
    int n=a.length;
    int m= b.length;
    int i=0,j=0;
    while( i<=n-1 &&  j<=m-1){
      if(a[i]<b[j]){
        res.add(a[i]);
        i++;


      }else if(a[i]==b[j]){
        res.add(a[i]);
        i++;
        j++;
      }else{
        res.add(b[j]);
        j++;
      }
    }
    while(i<=n-1){
        res.add(a[i]);
        i++;
    }
    while(j<=m-1){
        res.add(b[j]);
        j++;
    }

    return res;
}

public static void main(String[] args) {

    int[] a={2,7,9,10};
    int[] b={1,3,5,6,8};
    ArrayList<Integer> result= merge(a,b);
    System.out.println(result);
}
}