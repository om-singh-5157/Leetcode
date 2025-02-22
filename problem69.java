public class problem69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(64));
    }
    public static int mySqrt(int x) {
        int a=0,b=x,ans=0;
        while(a<=b){
            int mid=(a+b)/2;
            if((long)mid*mid<=x){
                ans=mid;
                a=mid+1;
            }
            else{
                b=mid-1;
            }
        }
        return ans;
    }
}
