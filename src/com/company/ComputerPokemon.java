package com.company;

import java.util.ArrayList;

public class ComputerPokemon  extends Pokemon{

   public ComputerPokemon(String name,int health,int attack,int defense,String appearance,String type,String size) {
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.defense = defense;
    this.appearance = appearance;
    this.type = type;
    this.size = size;

   }

    @Override
    public void getAttack() {

    }
}
