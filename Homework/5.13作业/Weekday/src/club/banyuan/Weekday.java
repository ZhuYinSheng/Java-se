package club.banyuan;

public enum Weekday {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"){
        public boolean isWeekday(){
            return true;
        }
    },

    SATURDAY("星期六"),
    SUNDAY("星期日"){
        public boolean isHoliday() {
            return true;
        }
    };

    private final String weekdayName;

    Weekday(String weekdayName){
        this.weekdayName = weekdayName;
    }

    public boolean isWeekday() {
        return true;
    }

    public boolean isHoliday() {
        return true;
    }

    public String getWeekdayName() {
        return weekdayName;
    }
}