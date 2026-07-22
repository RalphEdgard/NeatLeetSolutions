class Solution {
    public String reversePrefix(String s, int k) {
        // I am just goign to do string methods and string builder methods since i think i can do it, i might do two pointers after this 
        StringBuilder sb = new StringBuilder(s.substring(0,k)); // have no idea whats going on i have no idea whats going on here lol 
        
        // i think whats moost likely goign on is that we are encountering a problem that was created by someone who doesnt know what they are doing thats what i think
        // oh ok i forgot that java rule basically for string builder you can just use a line to execute a method like you see below hwich is what i did with the print statement and i basically did it twice but now when i take it away it will solve 
        return sb.reverse().toString() + s.substring(k,s.length()); 
    }
}
