import java.util.HashMap;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> frequencyMap = new HashMap<>();
        for(String x : strs){
            int[] charCount = new int[26];
            for (char c : x.toCharArray()){
                charCount[c - 'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append('#');
                keyBuilder.append(count);
            }
            String key = keyBuilder.toString();
            if (!frequencyMap.containsKey(key)) {
                frequencyMap.put(key, new ArrayList<>());
            }
            frequencyMap.get(key).add(x);
        }
        return new ArrayList<>(frequencyMap.values());
    }
}