package club.banyuan;

public class Main {

    public static void print(Weekday weekday){
        if(weekday.isHoliday(false)){
            System.out.println(weekday+"是假日");
        }else if(weekday.isWeekDay(true)){
            System.out.println(weekday+"不是假日");
        }
    }

    public static void main(String[] args) {
        for (Weekday weekday : Weekday.values()) {
            print(weekday);
        }

        Weekday sat = Weekday.SATURDAY;

        System.out.println(Weekday.SATURDAY.toString());
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.MONDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.TUESDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.WEDNESDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.THURSDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.FRIDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.SATURDAY));
        System.out.println(Weekday.SATURDAY.compareTo(Weekday.SUNDAY));
    }

}