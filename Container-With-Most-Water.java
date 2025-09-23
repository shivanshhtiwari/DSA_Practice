class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int maxWater=0;
        int lp=0; int rp= n-1;   

        while(lp<rp)
        {
            int h= Math.min(height[lp],height[rp]);
            int w= rp-lp;
            int currWater= h*w;
            maxWater= Math.max(maxWater,currWater);
            if(height[lp]<height[rp])
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return maxWater;
    }
}