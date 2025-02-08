
import java.util.Arrays;

public class problem4{
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        if(n%2!=0){
            int start=0 ,end=merged.length-1;
            int mid=(start+end)/2;
            return merged[mid];
        }
        else{
            double start1=0 , end1=merged.length-1;
            int mid1=(int)(((start1+end1)/2)-0.5);
            int mid2=(int)(((start1+end1)/2)+0.5);
            return (double)(merged[mid1]+merged[mid2])/2;
        }
    }
}