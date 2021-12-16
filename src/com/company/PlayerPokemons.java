package com.company;

import java.util.ArrayList;

public class PlayerPokemons  {
    int crystals;


    PlayerPokemons(int crystals){
        this.crystals = crystals;

    }

    @Override
    public String toString() {
        return "Player : " +
                "crystals = " + crystals +
                ", Pokemons = " + pokemons;
    }
}
