class Solution {
    public String largestGoodInteger(String num) {
        String largest="";
        int length= num.length();
        for(int i=0;i<=length-3;i++)
        {
            char c= num.charAt(i);
            if(c==num.charAt(i+1) && c==num.charAt(i+2))
            {
                String candidate = num.substring(i, i + 3);
                if (largest.equals("") || candidate.compareTo(largest) > 0) 
                {
                    largest = candidate;
                }
            }
        }
        return largest;
    }
}