import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int[] prefix= new int[n];
        int[] suffix= new int[n];
        Arrays.fill(prefix,1);
        Arrays.fill(suffix,1);
        for(int i=1;i<n;i++)
        {
            prefix[i]= prefix[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]= suffix[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]= prefix[i]*suffix[i];
        }
        return arr;
    }
}
