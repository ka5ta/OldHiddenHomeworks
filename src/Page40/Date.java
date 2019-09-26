package Page40;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
            // 1 => 0001
            // 1 => "1".length()
//        String originalYearStr = Integer.toString(year);
//            int paddingWidth = 4-originalYearStr.length();
//        String yearStr = "0".repeat(paddingWidth)+originalYearStr;
        return String.format("%02d/ %02d/ %04d",day,month,year);

    }

    public static void main(String[] args) {
        Date date = new Date(5,4,999);
        System.out.println(date);
    }
}
