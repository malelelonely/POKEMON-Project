package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        Pokemon[] pokemon = new Pokemon[5];
        pokemon[0] = new Pokemon("Pikachu", 310, 50, 50, "mouse", "electric", "small");
        pokemon[1] = new Pokemon("Baltazar", 340, 70, 70, "turtle", "water", "medium");
        pokemon[2] = new Pokemon("Balrock", 300, 60, 45, "bull", "earthquake", "large");
        pokemon[3] = new Pokemon("Rintar", 250, 110, 70, "butterfly", "air", "medium");
        pokemon[4] = new Pokemon("Valon", 285, 85, 130, "dragon", "fire", "large");
        System.out.println("Choose pokemon :");
        System.out.println("1. Pikachu");
        System.out.println("2. Baltazar");
        System.out.println("3. Balrock");
        System.out.println("4. Rintar");
        System.out.println("5. Valon");
        Scanner in = new Scanner(System.in);
        System.out.print("Your choose : ");
        int n = in.nextInt();

        switch (n) {
            case 1:
                System.out.println("You have chosen Pikachu");
               Battle.battle(pokemon[0], pokemon[random.nextInt(4)]);
                break;

            case 2:
                System.out.println("You have chosen Baltazar");
                Battle.battle(pokemon[1], pokemon[random.nextInt(4)]);
                break;
            case 3:
                System.out.println("You have chosen Balrock");
                Battle.battle(pokemon[2], pokemon[random.nextInt(4)]);
                break;
            case 4:
                System.out.println("You have chosen Rintar");
                Battle.battle(pokemon[3], pokemon[random.nextInt(4)]);
                break;
            case 5:
                System.out.println("You have chosen Valon");
                Battle.battle(pokemon[4], pokemon[random.nextInt(4)]);
                break;
        }

    }
}
