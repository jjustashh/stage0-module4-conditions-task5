package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 4, 11, 6, 9:
                System.out.println(30);
                break;
            default:
                System.out.println("wrong number!");
        }
    }
}
