import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        Arrays.sort(birdsPerDay);
        return  birdsPerDay[0] == 0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] newArray = Arrays.copyOfRange(birdsPerDay, 0, numberOfDays);

        int sum = Arrays.stream(newArray).sum();

        return sum;
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay)
        
        .filter(value -> value >= 5)
        .count();
    }
}
