class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        for(int num2:nums2)
        {
            set.add(num2);
        }
        ArrayList<Integer> list= new ArrayList<>();
        {
            for(int num1 : nums1)
            {
                if(set.contains(num1))
                {
                    list.add(num1);
                    set.remove(num1);
                }
            }
        }
        int[] res= new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]= list.get(i);
        }
        return res;
    }
}