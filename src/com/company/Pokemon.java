package com.company;

public class Pokemon {
    public Object battle;
    protected int health;
    protected int attack;
    protected int defense;
    protected String name;
    protected String appearance;
    protected String type;
    protected String size;
    public Pokemon(String name, int health, int attack, int defense,String appearance,String type,String size){
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.name = name;
        this.appearance = appearance;
        this.type = type;
        this.size = size;
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "battle=" + battle +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", name='" + name + '\'' +
                ", appearance='" + appearance + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }


}
