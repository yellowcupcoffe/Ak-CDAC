package cdac;

public class Date {

    private String day;
    private String date;

    public Date(String day, String date) {
        this.day = day;
        this.date = date;
    }

    @Override
    public String toString() {
        return day + " " + date;
    }
}