public class Solution {
    public int solve(String A) {
        if (A == null || A.length() == 0) return 0;
        int counter = 0;
        A = A.toLowerCase();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
                counter += A.length() - i;
            }
        }
        return counter % 10003;
    }
}
