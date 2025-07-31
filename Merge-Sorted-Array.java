class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m-1;
        int j= n-1;
        int indx= m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>=nums2[j])
            {
                nums1[indx]=nums1[i];
                i--;
                indx--;
            }
            else {
                nums1[indx]=nums2[j];
                j--;
                indx--;
            }
        }
        while(j>=0)
        {
            nums1[indx]=nums2[j];
            j--;
            indx--;
        }
    }
}