package Page40;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public Time nextSecond(){
        second+=1;
        if(second==60){
            second=0;
            minute+=1;
            if(minute==60){
                minute=0;
                hour+=1;
                if(hour>23){
                    hour=0;
                }
            }
        }
        return this;
    }

    public Time previousSecond(){
        second-=1;
        if(second<0){
            second=59;
            minute-=1;
            if(minute<0){
                minute=59;
                hour-=1;
                if(hour<0){
                    hour=23;
                    minute=59;
                    second=59;
                }
            }
        }
        return this;
    }


    public static void main(String[] args) {
        Time time = new Time(23,0,0);
        System.out.println(time.previousSecond());
//        System.out.println(time.nextSecond());

    }
}
