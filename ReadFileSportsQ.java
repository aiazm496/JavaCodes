package com.company;
//readfile match.txt and upon user input
//print no of games played,,won,lost.
import javax.tools.SimpleJavaFileObject;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;


public class ReadFileSportsQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        ArrayList<SportsClass> list = new ArrayList<>();
        try(Scanner sc = new Scanner(Paths.get(fileName))){
            while (sc.hasNextLine()){
                String row = sc.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.parseInt(parts[2]);
                int visitingPoints = Integer.parseInt(parts[3]);
                list.add(new SportsClass(homeTeam,visitingTeam,homePoints,visitingPoints));
            }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        //list with objects of SportsClass formed.
        System.out.println("Enter team name to see games played: ");
        String teamToCountGames = scanner.nextLine();
        int gamesPlayed = 0;
        for (SportsClass s : list){
            if(s.getHomeTeam().equalsIgnoreCase(teamToCountGames) || s.getVisitingTeam().equalsIgnoreCase(teamToCountGames)){
                gamesPlayed++;
            }
        }
        System.out.println("Games played: " + gamesPlayed);
        System.out.println("enter team name to get no of wins and losses: ");
        String noOfWinsLossesForThisTeam  = scanner.nextLine();
        int noOfWins = 0;
        int noOfLosses = 0;
        for(SportsClass j : list){
            if(j.getHomeTeam().equalsIgnoreCase(noOfWinsLossesForThisTeam) || j.getVisitingTeam().equalsIgnoreCase(noOfWinsLossesForThisTeam)){
                if(j.getHomeTeam().equalsIgnoreCase(noOfWinsLossesForThisTeam)){
                    if(j.getHomePoints()>j.getVisitingPoints()){
                        noOfWins++;
                    }else{
                        noOfLosses++;
                    }

                }else{
                    if(j.getVisitingPoints()>j.getHomePoints()){
                        noOfWins++;
                    }else{
                        noOfLosses++;
                    }
                }
            }

            }
        System.out.println("No of wins: " + noOfWins);
        System.out.println("No of losses: " + noOfLosses);

    }
}
