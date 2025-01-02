/**
 * The Time class represents a 24-hour digital clock.
 * Each clock displays a distinct number of hours, minutes and seconds of the current time.
 */

public class Time {

    private int hour;
    private int minute;
    private int seconds;

    /**
     * Constructor for the Time class. This creates a new instance of a Time given the below parameters.
     *
     * @param hour represents the hour of the day displayed by the clock
     * @param minute represents the minute of the hour of the day displayed by the clock
     * @param seconds represents the second of the minute of the hour of the day displayed by the clock
     */

    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    /**
     * The tick method will increase the clock's time by one second.
     * The amount of minutes and hours will also change accordingly if needed.
     */

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

    /**
     * The add method increases the clock's time by a specific amount.
     *
     * @param time represents the amount of time the clock should increase by
     */

    public void add(Time time) {
        int numOfHour = time.hour;
        int numOfMinute = time.minute;
        int numOfSeconds = time.seconds;

        if (seconds + numOfSeconds >= 60) {
            seconds = (seconds + numOfSeconds) - 60;
            numOfMinute ++;
        }
        else {
            seconds += numOfSeconds;
        }
        if (minute + numOfMinute >= 60) {
            minute = (minute + numOfMinute) - 60;
            numOfHour ++;
        }
        else {
            minute += numOfMinute;
        }
        if (hour + numOfHour >= 24) {
            hour = (hour + numOfHour) - 24;
        }
        else {
            hour += numOfHour;
        }
    }

    /**
     * toString method for the Time class.
     * This method will return a String showing the current formatted time of the clock.
     *
     * @return returns the current time in a String in a properly formatted manner
     */

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
