public class TASK22 {
    static void main(String[] args) {
        System.out.println(alarmClock(1, false));
    }

    public static String alarmClock(int day, boolean vacation) {
        if (day == 0 || day == 6) {
            if (vacation) {
                return "off";
            } else {
                return "10:00";
            }
        }


        if (vacation) {
            return "10:00";
        } else {
            return "7:00";
        }
    }
}

