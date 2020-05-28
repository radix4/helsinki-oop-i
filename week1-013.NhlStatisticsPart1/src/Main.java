import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);

        System.out.println("Top 10 by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();


        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();





    }
}
