public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1 2 3 4 5");

        for (int i = 0; i < (sb.length()) / 2; i++) {
            int front = i;
            int back = sb.length() - i - 1; // 6-0-1

            char atFront = sb.charAt(front);
            char atBack = sb.charAt(back);

            sb.setCharAt(front, atBack);
            sb.setCharAt(back, atFront);
        }
        System.out.println(sb);
    }
}
