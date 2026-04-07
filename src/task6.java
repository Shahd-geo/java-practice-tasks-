public class task6 {
    static void main(String[] args) {
        System.out.println(teaParty(6,8));
        System.out.println(teaParty(3,8));

    }
    public  static int teaParty(int tea, int candy){
        if (tea < 5 || candy < 5){
            return 0;
        }
        if (tea>= 5 && candy >=5){
            return 1;
        }
        if (tea>= 2* candy || candy>=2*tea){
            return 2;
        }
        else {
            return 1;
        }
    }
}
