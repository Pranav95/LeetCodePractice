class Solution {
    public List<String> summaryRanges(int[] nums) {
 		List<String> result = new ArrayList<String>();

 		if(nums==null || nums.length==0)
 			return result;

 		if(nums.length == 1)
 		{
 			result.add(nums[0]+ "");
 		}

 		int res = nums[0];
 		int first = nums[0];

 		for(int i = 1 ; i< nums.length ; i++)
 		{
 			if(nums[i]==res+1)
 			{
 				if(i == nums.length-1)
 				{
 					result.add(first + "->"+nums[i]);
 				}
 			}
 			else
 			{
 				if(first==res)
 				{
 					result.add(first+"");
 				}
 				else
 				{
 				result.add(first+"->" + res);
 				}

 				if(i == nums.length-1)
 				{
 				result.add(nums[i]+ "");
 				}
 				first = nums[i];
 			}
 			res = nums[i];
 		}
 		return result;

    }
}