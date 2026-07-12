class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, String> map = new HashMap<>();
        Set<String> chars = new HashSet<>();
        String[] arr = s.split(" "); 
        
        if (arr.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) { 
            chars.add(pattern.charAt(i)+"");
            if (map.get(arr[i]) != null && map.containsValue(pattern.charAt(i)+"")) { if (!map.get(arr[i]).equals(pattern.charAt(i)+"")) return false; }
            map.put(arr[i],pattern.charAt(i)+""); 
        } 

        String valsEncountered = ""; 
        
        for (Map.Entry<String, String> vals: map.entrySet()) {
            if (valsEncountered.contains(vals.getValue())) return false; 
            valsEncountered = valsEncountered + vals.getValue();
        }
        
        if (chars.size() != map.size()) { return false; }
        return true;
    }
}
