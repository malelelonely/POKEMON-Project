package com.company;

public class Pokemon {

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
    public Pokemon(){
        this.name = "Squirrel";
        this.type = "turtle";
        this.appearance = "Water";
        this.size = "small";
        this.attack = 48;
        this.defense = 65;
        this.health = 144;
    }
    public void Pokemon(){
        this.name = "aaSquirrel";
        this.type = "turtle";
        this.appearance = "Water";
        this.size = "small";
        this.attack = 48;
        this.defense = 65;
        this.health = 144;
    }



    @Override
    public String toString() {
        return "Pokemon{" +
                "Pokemon name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", appearance='" + appearance + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }


}
