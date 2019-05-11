class Solution {
public boolean detectCapitalUse(String word) {
        return word == null || word.length() < 2 || word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()) || word.substring(1).equals(word.substring(1).toLowerCase());
    }
}
