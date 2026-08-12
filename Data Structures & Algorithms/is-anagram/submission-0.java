class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sA=s.toCharArray();
        char[] st=t.toCharArray();
        Arrays.sort(sA);
        Arrays.sort(st);
        return Arrays.equals(sA,st);
    }
}
