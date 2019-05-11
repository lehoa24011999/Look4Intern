/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        int len=s.length();
        int[] arr=new int[26];
        for(int i=0;i<len;i++)
        {
            arr[s1[i]-97]++;
        }
        for(int i=0;i<len;i++)
        {
            if(!(arr[s2[i]-97]>0)) return false;
            arr[s2[i]-97]--;
        }
        return true;
    }
}
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}