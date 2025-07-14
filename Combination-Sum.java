class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    public void dfs(int [] nums, int s, int target, List<Integer> path, List<List<Integer>> ans)
    {
        if(target<0)
        {
            return;
        }
        if(target==0)
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=s;i<nums.length;i++)
        {
            path.add(nums[i]);
            dfs(nums, i, target-nums[i], path, ans);
            path.remove(path.size()-1);
        }
    }
}