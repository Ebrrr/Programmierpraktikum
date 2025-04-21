package TaskOne;

public class Publication {
    private String title;
    private int year;

    public String getInfo(){
        return title +"," + " Published in "+ year;

    }

    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
