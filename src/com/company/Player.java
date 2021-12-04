package com.company;

import java.util.ArrayList;

public class Player {
    int crystals;
    ArrayList<Pokemon>pokemons;
    Player(int crystals,ArrayList<Pokemon>pokemons){
        this.crystals = crystals;
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return "Player : " +
                "crystals = " + crystals +
                ", Pokemons = " + pokemons;
    }
}
