package Strings.easy;
class Solutionse6 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char temp = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(temp);
            if (goal.equals(sb.toString())) {
                return true;
            }
        }
        return false;
    }
}