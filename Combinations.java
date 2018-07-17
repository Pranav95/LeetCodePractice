class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        findCombinations(finalList, new ArrayList<Integers>(), 1, n , k);
        return finalList;
    }

    public void findCombinations(List<List<Integer>> finalList, List<Integer> tempList, int pos , int n , int k )
    {

    	if(k==0)
    	{
    		finalList.add(new ArrayList<Integer>(tempList));
    		return
    	}
    	for(int i = pos ; i <n ; i++ )
    	{
    		tempList.add(i);
    		findCombinations(finalList, tempList, i+1, n , k-1);
    		tempList.remove(tempList.size()-1);

    	}
    }
}