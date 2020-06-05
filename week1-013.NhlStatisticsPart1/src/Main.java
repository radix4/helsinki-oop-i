
import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sidney Crosby stats");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Stats for Philadelphia Flyers (PHI)");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("Players in Anaheim Ducks (ANA)");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
