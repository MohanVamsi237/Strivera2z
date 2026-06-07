// Single Number
package easy;
class Solutionae12 {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int x:nums){
            ans^=x;
        }
        return ans;
    }
}