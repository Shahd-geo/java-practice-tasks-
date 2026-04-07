public class TASK20 {
    static void main(String[] args) {
        System.out.println(shareDigit(12,23));
        System.out.println(shareDigit(12,34));

    }

    public static boolean shareDigit(int a, int b) {
        int a_left = a / 10;
        int a_right = a % 10;
        int b_left = b / 10;
        int b_right = b % 10;
        if (a_left == b_left || a_left == b_right || a_right == b_right || a_right == b_left) {
            return true;
        }
        return false;
    }

}
