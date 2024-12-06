public class Time {

    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public void tick() {
        if (seconds == 59) {
            seconds = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 23) {
                    hour = 0;
                }
                else {
                    hour ++;
                }
            }
            else {
                minute ++;
            }
        }
        else {
            seconds ++;
        }
    }

    public void add(Time time) {
        int numOfHour = time.hour;
        int numOfMinute = time.minute;
        int numOfSeconds = time.seconds;

        if (seconds + numOfSeconds >= 60) {
            seconds = (seconds + numOfSeconds) - 60;
            numOfMinute ++;
            if (minute + numOfMinute >= 60) {
                minute = (minute + numOfMinute) - 60;
                numOfHour ++;
                if (hour + numOfHour >= 24) {
                    hour = (hour + numOfHour) - 24;
                }
                else {
                    hour += numOfHour;
                }
            }
            else {
                minute += numOfMinute;
            }
        }
        else {
            seconds += numOfSeconds;
        }
    }

    public String toString() {
        String temp = "";
        if (hour < 10) {
            temp += "0" + hour + ":";
        }
        else {
            temp += hour + ":";
        }
        if (minute < 10) {
            temp += "0" + minute + ":";
        }
        else {
            temp += minute + ":";
        }
        if (seconds < 10) {
            temp += "0" + seconds;
        }
        else {
            temp += seconds;
        }
        return temp;
    }

}
