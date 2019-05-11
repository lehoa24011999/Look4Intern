class Solution {
public String convertToBase7(int num) {
    if(num == 0) return "0";
    StringBuilder rb = new StringBuilder();
    Boolean isNeg = num < 0;
    num = Math.abs(num);
    while(num > 0) {
      rb.append(num % 7);
      num /= 7;
    }
    return isNeg ? "-" + rb.reverse().toString() : rb.reverse().toString();
  }
}