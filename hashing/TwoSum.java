package hashing;

import java.util.HashMap;

public class TwoSum {
    public static int[] solution(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
          map.put(nums[i],i);   
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] n={3,2,4};
        int tar=6;
        int res[]=solution(n, tar);
        for(int k:res){
            System.out.println(k);
        }
    }
}

