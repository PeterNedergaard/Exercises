import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Match {
    // arraylist for each rank of the tournement
    public static ArrayList<String> preQuarter = new ArrayList<>();
    public static ArrayList<String> quarter = new ArrayList<>();
    public static ArrayList<String> semi = new ArrayList<>();
    public static ArrayList<String> finale = new ArrayList<>();

    Team teamA;
    Team teamB;

    // constructer for teamA/B and matchbracket for which bracket
    public Match(Team teamA, Team teamB, int matchBracket) {
        this.teamA = teamA;
        this.teamB = teamB;
        // if statement for each round of the bracket
        if (matchBracket == 8) Collections.addAll(preQuarter, teamA.teamName, teamB.teamName);
        else if (matchBracket == 4) Collections.addAll(quarter, teamA.teamName, teamB.teamName);
        else if (matchBracket == 2) Collections.addAll(semi, teamA.teamName, teamB.teamName);
        else if (matchBracket == 1) Collections.addAll(finale, teamA.teamName, teamB.teamName);
    }

    // show the first round of matches
    public static void showMatchProgram() {
        if (preQuarter.size() < 1) {
            assignTeamsToMatch();
            return;
        }
            //prequarters
        for (int i = 0; i < preQuarter.size(); i += 2) {
            System.out.println("\n"+"Pre-Quarter finaler: ");
            System.out.print("| " + preQuarter.get(i));
            System.out.print(" vs " + preQuarter.get(i + 1) + " |"+"\n");
        }
            // quarter
        for (int i = 0; i < quarter.size(); i += 2) {
            System.out.println("\n"+"Quarter: ");
            System.out.print("| " + quarter.get(i));
            System.out.print(" vs " + quarter.get(i + 1) + " |"+"\n");
        }

            // semi
        for (int i = 0; i < semi.size(); i += 2) {
            System.out.println("\n"+"Semi Finale: ");
            System.out.print("| " + semi.get(i));
            System.out.print(" vs " + semi.get(i + 1) + " |"+"\n");

        }
            // finale
        for (int i = 0; i < finale.size(); i += 2) {
            System.out.println("\n"+"The FINALE: ");
            System.out.print("| " + finale.get(i));
            System.out.print(" vs " + finale.get(i + 1) + " |"+"\n");

        }

    }

    // for writing inserting the team names playing
    public static void assignTeamsToMatch() {
        System.out.println("De første kampe er ikke blevet oprettet endnu.\n" +
                "Opret venligst de første kampe: ");
        // 8 loops that start in 1
        for (int i = 1; i < 9; i++) {
            String teamNameA;
            String teamNameB;
            // print team names and accepts input for names
            System.out.println("\nKamp " + i + ":");
            teamNameA = nameChecker(getUserInput("Indtast venligst navnet på hold A: "));
            teamNameB = nameChecker(getUserInput("Indtast venligst navnet på hold B: "));

            Collections.addAll(preQuarter, teamNameA, teamNameB);
        }

    }

    // name checker compares name from input with the arraylist of names
    public static String nameChecker(String name) {
        boolean nameExists = false;
        String teamName = name;
        // loop
        for (Team t : Tournament.teams) {
            // check if team name exist
            if (t.teamName.equalsIgnoreCase(teamName)) {
                System.out.println("Navnet findes!" + "\n");
                nameExists = true;
            }
        }
        // check if team doesn't exit
        if (!nameExists) {
            teamName = getUserInput("Navnet du har angivet til holdet findes ikke " +
                    "Indtast venligst navnet på holdet: ");
            teamName = nameChecker(teamName);
        }
        return teamName;
    }

    public static String getUserInput(String msg) {
        System.out.print(msg);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().trim();
    }
}