package Arrays;

public class sortcolors {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                //swap(nums,mid,high);
                mid++;
            }else{
                swap(nums,low,high);
                high--;
            }
        }
    }
    private static void swap(int[] nums, int a, int b) {
       int temp = nums[a];
       nums[a] = nums[b];
       nums[b] = temp;
   }
   //main method to test the sortColors function
   public static void main(String[] args) {
       sortcolors sorter = new sortcolors();
       int[] nums = {2, 0, 2, 1, 1, 0};
       sorter.sortColors(nums);
       for (int num : nums) {
           System.out.print(num + " ");
       }
   }
}
