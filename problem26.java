public class problem26 {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[c+1]=nums[i];
                c++;
            }
        }
        for(int i=0;i<c+1;i++){
            System.out.print(nums[i]);
        }
        System.out.println();
        return c+1;
    }
}
