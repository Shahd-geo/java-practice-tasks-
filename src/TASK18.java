public class TASK18 {
    static void main(String[] args) {
      System.out.println(lessBy10(1,7,11));
    }


    public static boolean lessBy10(int a, int b, int c) {
        if (Math.abs(a - b) >= 10 ||
                Math.abs(a - c) >= 10 ||
                Math.abs(b - c) >= 10) {
            return true;
        }
        return false;
    }
}



