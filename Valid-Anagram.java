class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null)
        {
            return false;
        }
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character, Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            char p= t.charAt(i);
            map1.put(c, map1.getOrDefault(c,0)+1);
            map2.put(p, map2.getOrDefault(p,0)+1);
        }
        return map1.equals(map2);
    }
}