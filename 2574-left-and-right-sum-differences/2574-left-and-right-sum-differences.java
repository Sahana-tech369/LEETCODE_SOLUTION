class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int left=0,right=0;
            for(int j=0;j<i;j++)
            left+=nums[j];
            for(int j=i+1;j<n;j++)
            right+=nums[j];
            ans[i]=Math.abs(left-right);
        }
        return ans;
    }
}