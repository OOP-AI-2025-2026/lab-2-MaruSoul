package ua.opnu;

public class TimeSpan {
    private int timeIntervalMinutesTotal;

    TimeSpan(int hours, int minutes) {
        add(hours, minutes);
    }

    int getHours() {
        return timeIntervalMinutesTotal / 60;
    }

    int getMinutes() {
        return timeIntervalMinutesTotal % 60;
    }

    void add(int hours, int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("minutes must be between 0 and 59");
        }

        if (hours < 0) {
            throw new IllegalArgumentException("an hour must be more than 0");
        }

        timeIntervalMinutesTotal += hours * 60 + minutes;
    }

    void addTimeSpan(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        return timeIntervalMinutesTotal / 60.0;
    }

    int getTotalMinutes() {
        return timeIntervalMinutesTotal;
    }

    void subtract(TimeSpan span) {
        if (span.getTotalMinutes() > getTotalMinutes()) {
            throw new IllegalArgumentException("You can't subtract span more than current time");
        }

        timeIntervalMinutesTotal -= span.getTotalMinutes();
    }

    void scale(int factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("You can't factor to negative number");
        }

        timeIntervalMinutesTotal *= factor;
    }
}