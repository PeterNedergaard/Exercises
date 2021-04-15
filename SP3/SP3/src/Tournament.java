// register, tournament tree,

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Tournament {

    public static ArrayList<Team> teams = new ArrayList<>();

    public Tournament(){
        readFileData();
    }

// reads the data file and prints
    public static ArrayList<Team> readFileData(){
        File file = new File("data.txt");
        String [] teamLine;
        ArrayList<String> names;
        Scanner scan = null;
        try{
            scan = new Scanner(file);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
            // once for each group
        if(scan != null) {
            while (scan.hasNextLine()) {
                names = new ArrayList<>();
                String line = scan.nextLine();
                // check for blank line
                if (line.isEmpty()) continue;
                teamLine = line.split(":");
                for (int i = 0; i < Integer.parseInt(teamLine[1]); i++) {
                    names.add(teamLine[i + 2]);
                }
                teams.add(new Team(teamLine[0], Integer.parseInt(teamLine[1]), names, Integer.parseInt(teamLine[teamLine.length-1])));


            }
        }
        return teams;
    }
}
