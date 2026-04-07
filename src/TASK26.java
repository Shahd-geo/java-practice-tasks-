public class TASK26 {
    static void main(String[] args) {
        System.out.println(fizzString2(1));
        System.out.println(fizzString2(2));
        System.out.println(fizzString2(5));
}
    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        }
        if (n % 3 == 0) {
            return "Fizz!";
        }
        if (n % 5 == 0) {
            return "Buzz!";
        }
        return n + "!";
    }
}
