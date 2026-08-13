package Arrays;

public class ContainerMostWater {
    public static int maxArea(int[] height) {
        int n=height.length;
        int max_water=0;
        int high=n-1;
        int low=0;
        while(low<=high){
            int width=high-low;
            int min_water=Math.min(height[high],height[low]);
            max_water=Math.max(max_water, min_water*width);
            if(height[low]<height[high]){
                low+=1;
            }else{
                high-=1;
            }
        }
        return max_water;
    }
    public static void main(String[] args) {
        int res=ContainerMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(res);
    }
}
