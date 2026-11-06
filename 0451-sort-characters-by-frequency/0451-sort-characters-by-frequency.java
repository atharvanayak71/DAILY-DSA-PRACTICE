class Solution {
    public String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));
        
        for(char ch : list){
            int freq = map.get(ch);
            res.append(String.valueOf(ch).repeat(freq));
        }
        
        return res.toString();
    }
}