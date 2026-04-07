public class TASK25 {
    static void main(String[] args) {
        System.out.println(answerCell(false, false, true));

    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep == true) {
            return false;
        }
        if (isMorning == true) {
            if (isMom == true) {
                return true;
            }
            if (isMorning == false) {
                return true;
            }

        }
        return false;
    }
}
