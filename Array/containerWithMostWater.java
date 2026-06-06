public class containerWithMostWater {
    public static int area(int[] height){
        int n=height.length;
        int area=0;
        int i=0,j=n-1;
        while(i<j){
            if(height[j]<=height[i]){
                area= Math.max(area,height[j]*(j-i));
            }else{
                area=Math.max(area,height[i]*(j-i));
            }
            if(height[i]<height[j]){
                i++;
            }
            else if(height[j]<height[i]){
                j--;
            }else{
                j--;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        int a[]={1,8,6,2,5,4,8,3,7};
        int res=area(a);
        System.out.println(res);
    }
}
