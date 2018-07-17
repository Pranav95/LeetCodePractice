class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> anaMap = new HashMap<String , List<String>>();

        for(String s: strs)
        {
            char[] schar = s.toCharArray();
            Arrays.sort(schar);
            String val = String.valueOf(schar);

            if(!anaMap.containsKey(val)) anaMap.put(val, new ArrayList<String>());

            anaMap.get(val).add(s);
        }     
        return new ArrayList<List<String>>(anaMap.values());
    }
}