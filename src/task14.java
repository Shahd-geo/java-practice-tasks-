public class task14 {
    static void main(String[] args) {
        System.out.println(old35(3));
        System.out.println(old35(10));
    }
    public  static boolean old35(int n){
        if (n% 3 == 0 || n%5==0){
            return true;
        }
        return false;
    }
}

