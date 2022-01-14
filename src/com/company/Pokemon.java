package com.company;

public abstract class Pokemon {

    protected int health;
    protected int attack;
    protected int defense;
    public String name;
    protected String appearance;
    protected String type;
    protected SizePokemon size;



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
