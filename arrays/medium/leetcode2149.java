// Rearrange Array Elements by Sign
package medium;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] A=new int[nums.length];
        int j=0,k=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                A[j]=nums[i];
                j=j+2;
            }
            else{
                A[k]=nums[i];
                k=k+2;
            }
        }
        return A;
    }
}