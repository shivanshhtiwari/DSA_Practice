import java.util.*;

class Solution {
    public void findcombination(int[] arr, int i, int target, List<Integer> combin, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(combin));
            return;
        }

        for (int start = i; start < arr.length; start++) {
            if (start > i && arr[start] == arr[start - 1]) continue; 
            if (arr[start] > target) break;

            combin.add(arr[start]);
            findcombination(arr, start + 1, target - arr[start], combin, ans);
            combin.remove(combin.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> combin = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        findcombination(arr, 0, target, combin, ans);
        return ans;
    }
}
