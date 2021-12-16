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

        int n,b,c;
        do {
            System.out.println("Choose 3 pokemons :");
            System.out.println("1. Pikachu");
            System.out.println("2. Baltazar");
            System.out.println("3. Balrock");
            System.out.println("4. Rintar");
            System.out.println("5. Valon");

            while (!in.hasNextInt()) {

                System.out.println("That's not a number!");
                in.next();
            }
            n = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        } while (n <= 0 || n>6|| b <= 0 || b>6|| c <= 0 || c>6 );
        System.out.println("Thank you for choose : " + n+ ","+ b+ ","+ c);
        ArrayList<Pokemon> playerPokemons = new ArrayList<>();
        playerPokemons.add(pokemon[n]);
        playerPokemons.add(pokemon[b]);
        playerPokemons.add(pokemon[c]);
        PlayerPokemons player = new PlayerPokemons(0, playerPokemons);
        System.out.println("You have chosen " + pokemon[n - 1].name);
        Battle.tournament(player, pokemon);

    }
}
