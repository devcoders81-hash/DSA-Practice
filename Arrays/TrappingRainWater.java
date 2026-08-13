package Arrays;

public class TrappingRainWater {
    public int trap(int[] height) {
        int n= height.length,ans=0,l=0,r=n-1,lmax=0,rmax=0;
        while (l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            if(lmax<rmax){
                ans+=lmax-height[l];
                l++;
            }else {
                ans+=rmax-height[r];r--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new TrappingRainWater().trap(new int[]{4,2,0,3,2,5}));
    }
}
