public class problem42 {
    //Trapping Rainwater
    class Solution {
        public int trap(int[] height) {
            int n=height.length;
            //calculate left max bound -array
            int[] leftMax=new int[n];
            leftMax[0]=height[0];
            for(int i=1;i<n;i++){
                leftMax[i]=Math.max(height[i],leftMax[i-1]);
            }
    
            //calculate right max bound -array
            int[] rightMax=new int[n];
            rightMax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
                rightMax[i]=Math.max(height[i], rightMax[i+1]);
            }
    
            //loop
            int trappedWater=0;
            for(int i=0;i<n;i++){
                //waterlevel = min(left max bound , right max bound)
                int waterLevel=Math.min(leftMax[i], rightMax[i]);
    
                //trappedwater = waterlevel - height
                trappedWater+=(waterLevel-height[i]);
            }
            return trappedWater;
        }
    }
}
