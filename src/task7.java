public class task7 {
    static void main(String[] args) {
        System.out.println(twoAsOne(1,2,3));
        System.out.println(twoAsOne(3,2,1));
        System.out.println(twoAsOne(3,2,2));

    }
    public  static boolean twoAsOne(int a, int b, int c){
        if (a + b == c || a+c==b || b+c==a){
            return true;
        }
        return false;
    }
}
