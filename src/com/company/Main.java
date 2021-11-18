package com.company;

public class Main {

    public static void main(String[] args) {
        Battle pokemon1 = new Battle("Pikachu",100,40,50,"mouse","electric","small");
        System.out.println(pokemon1);
        Battle pokemon2 = new Battle("Baltazar",200,30,70,"turtle","water","medium");
        System.out.println(pokemon2);
        pokemon1.battle(pokemon1,pokemon2);

    }
}
