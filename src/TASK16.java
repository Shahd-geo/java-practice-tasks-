public class TASK16 {
    static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
}
    public static String fizzString(String str){
    if (str.startsWith("f") && str.endsWith("b")){
        return  "FizzBuzz";
    }
        if (str.startsWith("f")) {

            return "Fizz";
        }
        if (str.endsWith("b")){
            return  "Buzz";
        }
        else {
            return str;
        }

    }
}
