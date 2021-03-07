
public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public void display() {
        System.out.print("\nHours: " + hours + "\nMinutes: " + minutes + "\nSeconds: " + seconds);
    }

    public void check() {
        if (hours <= 24 && hours >= 0) {
            System.out.print("");
        } else {
            hours = 0;
            System.out.print("Hours are out of bonds, setting to 0");
        }
        if (minutes <= 60 && minutes >= 0) {
            System.out.print("");
        } else {
            minutes = 0;
            System.out.print("Minutes are out of bonds, setting to 0");
        }
        if (seconds <= 60 && hours >= 0) {
            System.out.print("");
        } else {
            seconds = 0;
            System.out.print("Seconds are out of bonds, setting to 0");
        }
    }

    public void check(int hours, int minutes, int seconds) {
        if (hours <= 24 && hours >= 0) {
            this.hours = hours;
        } else {
            this.hours = 0;
            System.out.print("Hours are out of bonds, setting to 0");
        }
        if (minutes <= 60 && minutes >= 0) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
            System.out.print("Minutes are out of bonds, setting to 0");
        }
        if (seconds <= 60 && hours >= 0) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
            System.out.print("Seconds are out of bonds, setting to 0");
        }
    }
}
