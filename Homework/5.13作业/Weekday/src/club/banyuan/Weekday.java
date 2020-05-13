package club.banyuan;

public enum Weekday {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private final String weekdayName;

    Weekday(String weekdayName) {
        this.weekdayName = weekdayName;
    }

    public boolean isWeekDay(boolean weekday){
        if(this.equals(SATURDAY) || this.equals(SUNDAY))
            weekday = false;
        return weekday;
    }

    public boolean isHoliday(boolean holiday){
        if(this.equals(SATURDAY) || this.equals(SUNDAY))
            holiday = true;
        return holiday;
    }

    @Override
    public String toString() {
        return this.weekdayName;
    }

}