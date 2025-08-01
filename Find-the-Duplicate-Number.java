class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> Map= new HashMap<>();
        int n= nums.length;
        for(int num:nums)
        {
            if(Map.containsKey(num))
            {
                return num;
            }
            else
            {
                Map.put(num,1);
            }
        }
        return -1;
    }
}