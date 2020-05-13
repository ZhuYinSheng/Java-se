package club.banyuan;

public class Main {
    public static void main(String[] args) {
        for(Weekday one : Weekday.values()) {
//            System.out.println(one + "：" + one.getWeekdayName());
        }

        Weekday sat = Weekday.SATURDAY;

        switch (sat) {
            case MONDAY:
                System.out.println("今天是星期一：" + "是否为工作日：" + Weekday.MONDAY.isWeekday());
                break;
            case TUESDAY:
                System.out.println("今天是星期二：" + "是否为工作日：" + Weekday.TUESDAY.isWeekday());
                break;
            case WEDNESDAY:
                System.out.println("今天是星期三：" + "是否为工作日：" + Weekday.WEDNESDAY.isWeekday());
                break;
            case THURSDAY:
                System.out.println("今天是星期四：" + "是否为工作日：" + Weekday.THURSDAY.isWeekday());
                break;
            case FRIDAY:
                System.out.println("今天是星期五：" + "是否为工作日：" + Weekday.FRIDAY.isWeekday());
                break;
            case SATURDAY:
                System.out.println("今天是星期六：" + "是否为假期：" + Weekday.SATURDAY.isHoliday());
                break;
            case SUNDAY:
                System.out.println("今天是星期日：" + "是否为假期：" + Weekday.SUNDAY.isHoliday());
                break;
            default:
                System.out.println(sat);
                break;
        }

        System.out.println(Weekday.SATURDAY.getWeekdayName());
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.MONDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.TUESDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.WEDNESDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.THURSDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.FRIDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.SATURDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.SUNDAY));
    }
}
