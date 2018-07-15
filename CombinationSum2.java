class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     
        List<List<Integer>> solutionList = new ArrayList<>();

        Arrays.sort(candidates);
        findSolutions(candidates, solutionList, new ArrayList<>(), target, 0);
        return solutionList ; 
    }

    public void findSolutions( int[] candidates, List<List<Integer>> solutionList, List<Integer> temp, int target, int start)
    {
        if(target<0)
            return ;

        else if(target==0 && !solutionList.contains(new ArrayList<>(temp)))
            solutionList.add(new ArrayList<>(temp)) ;

        else
        {
            for(int i = start ; i< candidates.length ; i++)
            {
                temp.add(candidates[i]);
                findSolutions(candidates,solutionList, temp, target- candidates[i], i+1);
                temp.remove(temp.size()-1);
            }
        }

    }
}