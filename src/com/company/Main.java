package com.company;

public class Main {

    public static void main(String[] args) {
        Battle pokemon1 = new Battle("Pikachu",100,50,50,"mouse","electric","small");
        System.out.println(pokemon1);
        Battle pokemon2 = new Battle("Baltazar",200,30,70,"turtle","water","medium");
        System.out.println(pokemon2);
        Battle pokemon3 = new Battle("Balrock",90,60,45,"bull","earthquake","large");
        System.out.println(pokemon3);
        Battle pokemon4 = new Battle("Rintar",140,110,70,"butterfly","air","medium");
        System.out.println(pokemon4);
        Battle pokemon5 = new Battle("Valon",95,85,130,"dragon","fire","large");
        System.out.println(pokemon5);

        pokemon1.battle(pokemon1,pokemon2);
        

    }
}
