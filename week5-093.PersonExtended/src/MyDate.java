
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        if (earlier(compared)) {
            return compared.differneceInYears(this);
        }
        return calculateDifference(compared);
    }

    private int calculateDifference(MyDate mydate) {
        int year = 0;

        if (this.month < mydate.month) {
            year = 1;
        } else if (this.month == mydate.month && this.day < mydate.day) {
            year = 1;
        }

        return this.year - mydate.year - year;
    }
  
}
