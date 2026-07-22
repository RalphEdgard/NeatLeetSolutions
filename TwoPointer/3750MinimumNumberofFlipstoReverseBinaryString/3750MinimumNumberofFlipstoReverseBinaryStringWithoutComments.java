class Solution {
    public int minimumFlips(int n) {
        Integer value = Integer.valueOf(n);
        String value2 = new StringBuilder(Integer.toBinaryString(value)).reverse().toString();
        int needsFlip = 0;
        for (int i = 0, j = 0; i < Integer.toBinaryString(value).length(); i++, j--) 
            if ((Integer.toBinaryString(value).charAt(i) != value2.charAt(i))) needsFlip++;
        return needsFlip; 
    }
}
