class Solution {
    public int minimumFlips(int n) {
        // i did not read the question well :?
        Integer value = Integer.valueOf(n);
        // from what needs to be done is we right need to compare reversed and original version my logic was to see what was not equal to each other 
        // because if they were equal then there was no need for a "flip" lets see if my answer works 
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(value));
        String value2 = sb.reverse().toString();
        int needsFlip = 0;
        for (int i = 0, j = 0; i < Integer.toBinaryString(value).length(); i++, j--) {
            if ((Integer.toBinaryString(value).charAt(i) != value2.charAt(i))) needsFlip++;
        }
        return needsFlip; 
    }
}
