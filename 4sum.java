class Solution
{
	public List<List<Integer>> findFourSum(int[] nums, int target)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums==null || num.length < 4)
		{
			return result;
		}

		for(int i = 0 ; i<nums.length-3 ; i++)
		{
			//check for duplicates
			if(i!=0 && num[i]==nums[i-1])
				continue;
			for(int j = i+1 ; j<nums.length-2 ; j--)
			{
				if(j!=i+1 && nums[j]==nums[j-1])
					continue;

				int k = j+1 ;
				int l = nums.length-1;

				while(k<l)
				{
					if(nums[i]+ nums[j] + nums[k] + nums[l]<target)
						k++;
					else if(nums[i]+ nums[j] + nums[k] + nums[l]>target)
						l--;
					else
					{
						List<Integer> temp = new ArrayList<Integer>();
						temp.add(i);
						temp.add(j);
						temp.add(k);
						temp.add(l);
						result.add(temp);
						k++;
						l--

						//handle duplicates
						while(k<l && nums[k]==nums[k-1])
							k++;
						while(k<l && nums[l]==nums[l+1])
							l--
					}
				}
			}
		}
		return result;
	}

}