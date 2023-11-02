package src.week_09.assignment.Question_09_06;

public class StopWatch {

    private long startTime;
    private long endTime;

    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    void start(){
        startTime = System.currentTimeMillis();
    }

    void stop(){
        endTime  =System.currentTimeMillis();
    }

    long elapsedTime(){
        return endTime - startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
