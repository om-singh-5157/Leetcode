public class problem1{
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target =22;
        int arr[]=twoSum(nums, target);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static int[] twoSum(int[] nums,int target){
        int[] arr=new int[2];
        if(nums.length>=2){
            int sum;
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    sum=nums[i];
                    sum=sum+nums[j];
                    if (sum==target){
                        arr[0]=i;
                        arr[1]=j;
                    }
                }
            }
        }
        return arr;
    }
}
