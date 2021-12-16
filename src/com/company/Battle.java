package com.company;

import java.util.Random;
import java.util.Scanner;

public class Battle {


    public static void battle(Pokemon pokemon1, Pokemon pokemon2) {
        Scanner input = new Scanner(System.in);
        int restart;
        int crystals = 0;
        System.out.println(pokemon1.name + " begins the fight against " + pokemon2.name);
        pokemon1.health += pokemon1.defense;
        pokemon2.health += pokemon2.defense;
        while
        (pokemon1.health >= 1 && pokemon2.health >= 1) {
            pokemon2.health = pokemon2.health - pokemon1.attack;
            System.out.println(pokemon1.name + " does " + pokemon1.attack + " damage to " +
                    pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " health left.");
            if
            (pokemon2.health <= 0)
                break;
            pokemon1.health = pokemon1.health - pokemon2.attack;

            System.out.println(pokemon2.name + " does " + pokemon2.attack + " damage to " +
                    pokemon1.name + " and " + pokemon1.name + " has " + pokemon1.health + " health left.");
        }
        if
        (pokemon1.health <= 0) {
            System.out.println("LOSER!");
            System.out.println(pokemon1.name + " has lost the fight");
        } else {
            crystals += 15;
            System.out.println("WINNER!");
            System.out.println(pokemon2.name + " has lost the fight and you have won 15 crystals");
            System.out.println("Total crystals : " + crystals);
        }
        System.out.println("");
        System.out.println("Fight again?");
        System.out.println("1 for Yes");
        System.out.println("2 for No");
        restart = input.nextInt();
        if (restart == 1) {

        } else if (restart == 2) {

            System.out.println("Thank you for playing!");
        }
    }
    public static void tournament(PlayerPokemons player,Pokemon computerPokemons[]){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Choose pokemon to enter in battle");

            System.out.println(player);
            int n = input.nextInt();
            player.crystals +=15;

            battle(player.pokemons.get(n-1),computerPokemons[random.nextInt(4)]);
        }

    }
}




