class Solution {
    public boolean isOneBitCharacter(int[] bits) {
            int idx = 0;
            while (idx < bits.length - 1) {
                idx += bits[idx] + 1;
                //idx += bits[idx] == 1 ? 2 : 1;
            }
            return idx == bits.length - 1;
        }
}