package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pokemon[] pokemon = new Pokemon[5];
        pokemon[0] = new Pokemon("Pikachu", 310, 50, 50, "mouse", "electric", "small");
        pokemon[1] = new Pokemon("Baltazar", 340, 70, 70, "turtle", "water", "medium");
        pokemon[2] = new Pokemon("Balrock", 300, 60, 45, "bull", "earthquake", "large");
        pokemon[3] = new Pokemon("Rintar", 250, 110, 70, "butterfly", "air", "medium");
        pokemon[4] = new Pokemon("Valon", 285, 85, 130, "dragon", "fire", "large");
        System.out.println("Choose 3 pokemons :");
        System.out.println("1. Pikachu");
        System.out.println("2. Baltazar");
        System.out.println("3. Balrock");
        System.out.println("4. Rintar");
        System.out.println("5. Valon");

        System.out.println("Choose 3 pokemons : ");
        int n = in.nextInt()-1;
        int b = in.nextInt()-1;
        int c = in.nextInt()-1;
        if (n < 5 || b < 5 || c < 5) {
            ArrayList<Pokemon> playerPokemons = new ArrayList<>();
            playerPokemons.add(pokemon[n]);
            playerPokemons.add(pokemon[b]);
            playerPokemons.add(pokemon[c]);

            Player player = new Player(0, playerPokemons);

            System.out.println("You have chosen" + "\n" + "1." + pokemon[n].name + "\n" + "2." + pokemon[b].name + "\n" + "3." + pokemon[c].name);
            Battle.tournament(player, pokemon);

        } else {
            System.out.println("Wrong input");
        }
    }
}
