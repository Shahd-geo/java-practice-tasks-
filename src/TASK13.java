public class TASK13 {
    static void main(String[] args) {
        System.out.println( in1To10(5,false));
        System.out.println( in1To10(11,false));
        System.out.println( in1To10(11,true));

    }
    public static boolean in1To10(int n, boolean outsideMode){
        if (outsideMode){
            return (n<=1 || n >= 10);
        }
        else {
            return (n>= 1 && n <=10);
        }

    }
}
