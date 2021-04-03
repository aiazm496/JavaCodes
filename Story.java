package com.company;
import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        System.out.println("I will tell you a story.\nBut i need some information before i can narrate the story to you.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of the protagonist?");
        String name = scanner.nextLine();
        System.out.println("Where does the protagonist live?");
        String place = scanner.nextLine();

        System.out.println("There was a person named " + name + "." + " He was a software engineer.\n" + "He was from " + place + ".");


    }

}
