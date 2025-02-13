public class problem80 {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int k=0;
        int arr[]=new int[nums.length];
        if(nums.length==1){
            arr[k++]=nums[nums.length-1];
            for(int i=0;i<k;i++){
                nums[i]=arr[i];
            }
            return k;
        }
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]!=nums[i+2]){
                arr[k++]=nums[i];
            }
        }
        arr[k++]=nums[nums.length-2];
        arr[k++]=nums[nums.length-1];
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        return k;
    }
}
