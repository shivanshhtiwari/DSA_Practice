class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        Stack<Integer> stack= new Stack<>();
        int[] ans= new int[n];
        Arrays.fill(ans, -1);
        for(int i=2*n;i>=0;i--)
        {
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i%n])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
            ans[i%n]=nums[stack.peek()];
            }
            stack.push(i%n);
        }
        return ans;
    }
}