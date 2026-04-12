1class Solution {
2    public int lengthOfLastWord(String s) {
3        int n = s.length() - 1;
4        int c = 0;
5        while (n >= 0 && s.charAt(n) == ' ') {
6            n--;
7        }
8        while (n >= 0 && s.charAt(n) != ' ') {
9            c++;
10            n--;
11        }
12        return c;
13    }
14}