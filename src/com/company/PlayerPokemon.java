package com.company;

import java.util.ArrayList;

public class PlayerPokemon extends Pokemon  {



    PlayerPokemon(String name,int health,int attack,int defence,String appearance,String type,String size){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defence;
        this.appearance = appearance;
        this.type = type;
        this.size = size;

    }

    @Override
    public void getAttack() {

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
