class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hash= new HashMap<>();
        for(int num:nums)
        {
            hash.put(num, hash.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: hash.entrySet())
        {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}