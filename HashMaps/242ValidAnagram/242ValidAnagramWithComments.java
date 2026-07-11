class Solution {
    public boolean isAnagram(String s, String t) {
        // sorry, this is simple, for anagrams they are just different words that when rearranged 
        // they can spell out the word being compared to 
        // i plan to count the characters and if their numbers match up we are good 
        Map<Character, Integer> sMap = new HashMap<>(); // to keep track of counts 
        Map<Character, Integer> tMap = new HashMap<>();

        if (s.length() == t.length()) { // just to ensure we dont encounter null pointer exception 
            for (int i = 0; i < s.length(); i++) { // traverse through one to access both strings 
                sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
                tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
            }
            // below we will traverse through both using one loop, or get creative 
            // seems like we are goign to compare by length and counts seems like keys could be in order 

            // well when you dont know how to solve a problem you can ask for hints or search on how to do different htings 
            int match = 0;
            for (Map.Entry<Character, Integer> vals: sMap.entrySet()) { // this was my way to traverse through both maps and check if their counts match 
                // if there is one that does not match return false but if all match return true
                
                // yeah even i got lost with what i was doing tbh, but the proble here was that i think iwas comparing memory rather than the actual values 
                // you have to keep track of everything that you do because its very easy to get lost 
                // personally me i like to play around with leetcode problems sometimes it could take me hours but thats jus the way to get it 
                // once you are really tired then you can go to chatgpt 
                // i will explain in depth what has done after i get the problems solved 

                // we first check if any of the values are null if one of them are then return false else we increment match variable 
                // we comopare both values by actual value not reference in memory 
                // i would definitely say to get to know java at an elementary level, that sounds easy but it means you need to get good with lambdas and 
                // the three pillars of programming Inheritance, polymorphism and encapsulation 
                // i will eventually post more videos that will take long so you can see how i learn, the point of these videos are to learn how i learn 
                // see i i grind in the mud so you can do the same thing 
                if ((tMap.get((vals.getKey())) != null && vals.getValue() != null) && (tMap.get((vals.getKey())).equals(vals.getValue()))) { 
                    match++;
                } else return false;
            }
            
            if (match == tMap.size()) return true;
            
        } 
        return false; 
    }
}
