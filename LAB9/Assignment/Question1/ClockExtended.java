package com.company;

public class ClockExtended extends Clock{
    private String format;
    private String dayNight;

    public ClockExtended(int hours, int minutes, int seconds, String format, String dayNight){
        super(hours, minutes, seconds);
        setDayNight(dayNight);
        setFormat(format);
    }

    public void setDayNight(String dayNight) {
        this.dayNight = dayNight;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDayNight() {
        return dayNight;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void displayClock(){
        System.out.println(getHours()+" : "+getMinutes()+" : "+getSeconds()+"\nFormat: "+getFormat());
        if (dayNight.equals("am") || dayNight.equals("AM")){
            System.out.print(getHours()+" : "+getMinutes()+" : "+getSeconds()+"\nAM/PM: "+getDayNight());
        }
        else {
            setHours(getHours()-12);
            System.out.print(getHours()+" : "+getMinutes()+" : "+getSeconds()+"\nAM/PM: "+getDayNight());
        }
    }
}