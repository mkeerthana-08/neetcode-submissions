class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ns=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                ns.append(Character.toLowerCase(c));
            }
        }
        String revstr= new StringBuilder(ns).reverse().toString();
        return ns.toString().equals(revstr);
        
    }
}