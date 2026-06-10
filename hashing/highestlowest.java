package hashing;

import java.util.HashMap;

public class highestlowest {

    public static void highestLowest(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        int maxElement = -1;
        int minElement = -1;

        for(int key : map.keySet()) {

            int freq = map.get(key);

            if(freq > maxFreq) {
                maxFreq = freq;
                maxElement = key;
            }

            if(freq < minFreq) {
                minFreq = freq;
                minElement = key;
            }
        }

        System.out.println("Highest Frequency Element: " + maxElement);
        System.out.println("Lowest Frequency Element: " + minElement);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 1, 4};

        highestLowest(arr);
    }
}