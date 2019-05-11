class Solution {
public char findTheDifference(String s, String t) {
    int num = t.charAt(s.length()); // t.length()-1 = s.length()
	for (int i = 0; i < s.length(); i++) {
		num -= s.charAt(i);
		num += t.charAt(i);
	}
	return (char) num;
}
}