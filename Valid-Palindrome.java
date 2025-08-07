class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        int n= s.length();
        for(int i=0;i<n;i++)
        {
            char c= s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        int left=0; int right= cleaned.length()-1;
        while(left<right)
        {
            if(cleaned.charAt(left)!=cleaned.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}