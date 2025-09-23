class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int leftMax=0; int rightMax=0; int left=0; int right=n-1; int waterTrapped=0;
        while(left<right)
        {
            leftMax= Math.max(leftMax, height[left]);
            rightMax= Math.max(rightMax, height[right]);

            if(leftMax<rightMax)
            {
                waterTrapped+= leftMax-height[left];
                left++;
            }
            else
            {
                waterTrapped+= rightMax-height[right];
                right--;
            }
        }
        return waterTrapped;
    }
}