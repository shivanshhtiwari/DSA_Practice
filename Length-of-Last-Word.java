class Solution {
    public int lengthOfLastWord(String s) {
        String str= s.trim();
        int n=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                n++;
            }
            else{
                break;
            }
        }
        return n;
    }
}