class Solution {
    public void findcombin(int[] arr, int i, int target, List<Integer> combin, List<List<Integer>> ans)
    {
        if(target<0 || i==arr.length)
        {
            return;
        }
        if(target==0)
        {
            ans.add(new ArrayList<>(combin));
            return;
        }

        combin.add(arr[i]);
        findcombin(arr, i, target-arr[i], combin, ans);
        combin.remove(combin.size()-1);
        findcombin(arr, i+1, target, combin, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combin= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        findcombin(candidates, 0, target, combin, ans);
        return ans;
    }
}