class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        Stack<Integer> stack= new Stack<>();
        int[] ans= new int[n];
        Arrays.fill(ans, -1);

        for(int i=0;i<2*n;i++)
        {
            int current= nums[i%n];
            while(!stack.isEmpty() && nums[stack.peek()]<current)
            {
                int index=stack.pop();
                ans[index]= current;
            }
            if(i<n)
            {
                stack.push(i);
            }
        }
        return ans;
    }
}