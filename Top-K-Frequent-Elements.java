class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n= nums.length;
        int[] arr= new int[k];
        HashMap<Integer, Integer> hash= new HashMap<>();
        for(int num:nums)
        {
            hash.put(num, hash.getOrDefault(num, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> freqList= new ArrayList<>(hash.entrySet());
        Collections.sort(freqList, (a,b)-> b.getValue()-a.getValue());

        for(int i=0;i<k;i++)
        {
            arr[i]= freqList.get(i).getKey();
        }
        return arr;
    }
}