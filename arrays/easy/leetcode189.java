// Rotate Array
package easy;
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        k=k%nums.length;
        int[] A=new int[nums.length];
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            A[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++){
            A[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=A[i];
        }
        return ;
    }
}