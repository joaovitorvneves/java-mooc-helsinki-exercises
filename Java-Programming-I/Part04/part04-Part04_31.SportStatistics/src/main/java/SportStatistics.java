
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        String[] pieces = readMatches(fileName, team).split(",");
        
        System.out.println("Games: " + pieces[0]);
        System.out.println("Wins: " + pieces[1]);
        System.out.println("Losses: " + pieces[2]);
    }
    
    public static String readMatches(String file, String team) {
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                String[] pieces = line.split(",");
                
                String homeTeam = pieces[0];
                String awayTeam = pieces[1];
                int homeGoals = Integer.valueOf(pieces[2]);
                int awayGoals = Integer.valueOf(pieces[3]);
                
                if (homeTeam.equals(team) && homeGoals > awayGoals) {
                    games++;
                    wins++;
                }
                
                if (homeTeam.equals(team) && homeGoals < awayGoals) {
                    games++;
                    losses++;
                }
                
                if (awayTeam.equals(team) && homeGoals < awayGoals) {
                    games++;
                    wins++;
                }
                
                if (awayTeam.equals(team) && homeGoals > awayGoals) {
                    games++;
                    losses++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return games + "," + wins + "," + losses;
    }
}
