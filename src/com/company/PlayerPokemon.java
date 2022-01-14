package com.company;

import java.util.ArrayList;

public class PlayerPokemon extends Pokemon  {



    public PlayerPokemon(String name,int health,int attack,int defence,String appearance,TypePokemon types,SizePokemon sizes){

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defence;
        this.appearance = appearance;
        this.type = type;
        this.size = size;

    }



    @Override
    public String toString() {
        return "Pokemon{" +
                "health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", name='" + name + '\'' +
                ", appearance='" + appearance + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
