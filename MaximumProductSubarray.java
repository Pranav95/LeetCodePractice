class Solution {
    public int maxProduct(int[] nums) {
        int greatest = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length-1; i++)
        {
        	int temp = findgreatest(nums, i, Integer.MIN_VALUE)
        	if(temp>greatest)
        		greatest = temp;
        }
    }

    private int findgreatest(int[] nums , int start, int greatest)
    {

    }
}