package Strings.easy;
class Solutionse7 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] A=new int[26];
        for(int i=0;i<s.length();i++){
            A[s.charAt(i)-'a']++;
            A[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(A[i]!=0){
                return false;
            }
        }
        return true;
    }
}