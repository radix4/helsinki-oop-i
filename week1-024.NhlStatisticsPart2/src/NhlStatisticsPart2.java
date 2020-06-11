/** This program allows user to query for NHL stats.
 * @author  Thang Cao
 * @since   06/11/2020
 * */


import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.print("who: ");
                String who = reader.nextLine();
                nhlstats.NHLStatistics.searchByPlayer(who);
            } else if (command.equals("club")) {
                System.out.print("team: ");
                String team = reader.nextLine();
                NHLStatistics.sortByPoints();
                nhlstats.NHLStatistics.teamStatistics(team);
            }

        }
    }
}
