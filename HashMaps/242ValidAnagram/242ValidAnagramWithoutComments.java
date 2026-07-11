class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>(); 
        Map<Character, Integer> tMap = new HashMap<>();

        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) { 
                sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
                tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
            }
            int match = 0;
            for (Map.Entry<Character, Integer> vals: sMap.entrySet()) { 
                if ((tMap.get((vals.getKey())) != null && vals.getValue() != null) && (tMap.get((vals.getKey())).equals(vals.getValue()))) { 
                    match++;
                } else return false;
            }
            
            if (match == tMap.size()) return true;
            
        } 
        return false; 
    }
}
