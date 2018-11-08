package main.java.chapter4;

class Clock {
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
public class ClockTestDrive {
    public static void main(String[] args) {
        Clock clock = new Clock();

        clock.setTime("1245");
        String tod = clock.getTime();

        System.out.println("time: "+tod);
    }
}
