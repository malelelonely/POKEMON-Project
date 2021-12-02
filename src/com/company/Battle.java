package com.company;

import java.util.Scanner;

public class Battle extends Pokemon {


    public Battle(String name, int health, int attack, int defense, String appearance, String type, String size) {
        super(name, health, attack, defense, appearance, type, size);

    }

    public void battle(Pokemon pokemon1, Pokemon pokemon2) {
        Scanner input = new Scanner(System.in);
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
        }
    }




