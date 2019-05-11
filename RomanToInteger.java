class Solution {
    public int romanToInt(String s) {
        char[] characters = s.toCharArray();
        int totalValue = 0;

        for (int i = characters.length - 1; i >= 0; i--) {
            int value = getValue(characters[i]);
            if (i < characters.length - 1 && getValue(characters[i + 1]) > value) {
                totalValue -= value;
            } else {
                totalValue += value;
            }
        }

        return totalValue;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }  

}