package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String result;

        switch (year % 4) {
            case 0:
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        result = "leap";
                    } else {
                        result = "not leap";
                    }
                } else {
                    result = "leap";
                }
                break;
            default:
                result = "not leap";
                break;
        }

        System.out.println(result);
    }
}
