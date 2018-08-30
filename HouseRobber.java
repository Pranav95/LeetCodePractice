class Solution {
   public int rob(int[] nums) {
        int prevRobbed = 0;
        int prevNotRobbed = 0; 

        for(int i = 0 ; i<nums.length ; i++)
        {
            int currentRobbed = prevNotRobbed + nums[i];
            int currentNotRobbed = Math.max(prevRobbed,prevNotRobbed);

            prevRobbed = currentRobbed;
            prevNotRobbed = currentNotRobbed ;
        }

        return (Math.max(prevRobbed,prevNotRobbed)) ;
    }
}