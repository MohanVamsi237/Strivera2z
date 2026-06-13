package Strings.medium;
class Solutionsm2 {
    public int maxDepth(String s) {
        int depth=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
                count=Math.max(depth,count);
            }
            if(s.charAt(i)==')'){
                depth--;
            }
        }
        return count;
    }
}