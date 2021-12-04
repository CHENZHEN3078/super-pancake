package work;

public class DateCheck {
    public void check(int month, int day) throws DateCheckException {
        if (month <= 12 && month >= 1) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day >= 1 && day <= 31) {
                }
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day >= 1 && day <= 30) {
                }
            }
            if (month == 2) {
                if (day >= 1 && day <= 28) {
                }
            }
        } else {
            throw new DateCheckException("日期输入有误");
        }
    }
}
