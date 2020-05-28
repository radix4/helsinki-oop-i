public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate){
        int totalDays1 = 0;
        int totalDays2 = 0;
        int differenceInDays = 0;
        int differenceInYears = 0;

        totalDays1 = this.day + (this.month * 30) + (this.year * 365);
        totalDays2 = comparedDate.day + (comparedDate.month*30) + (comparedDate.year * 365);
        differenceInDays = Math.abs(totalDays1 - totalDays2);
        differenceInYears = differenceInDays / 365;

        System.out.println(totalDays1);
        System.out.println(totalDays2);

        return differenceInYears;
    }

}
