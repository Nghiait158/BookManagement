public class Day {
    private int day;
    private int month;
    private int year;
    // constructor-------------
    public Day(){
    }
    public Day(int day, int month, int year){
        this.day=day;
        this.month=month; 
        this.year=year;
    }
    // setter and getter
    public void setDay(int day){
        this.day=day;
    }
    public int getDay(){
        return day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getMonth(){
        return month;
    }
    public void setYear( int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }

    public String toString(){
        return day+ "/"+ month+ "/"+year;
    }
}

