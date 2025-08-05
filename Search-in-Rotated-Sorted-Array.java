class Solution {
    public int search(int[] nums, int target) {
        int n= nums.length;
        int first=0; int last= n-1;
        while(first<=last)
        {
            int mid= first+(last-first)/2;
            if(nums[mid]==target) return mid;

            if(nums[first]<=nums[mid])
            {
                if(nums[first]<=target && target<=nums[mid]) last= mid-1;
                else first=mid+1;
            }
            else {
                if(nums[mid]<target && target<=nums[last]) first= mid+1;
                else last= mid-1;
            }
        }
        return -1;
    }
}