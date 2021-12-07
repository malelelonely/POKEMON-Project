package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        Battle pokemon1 = new Battle("Pikachu",100,50,50,"mouse","electric","small");
        Battle pokemon2 = new Battle("Baltazar",200,30,70,"turtle","water","medium");
        Battle pokemon3 = new Battle("Balrock",90,60,45,"bull","earthquake","large");
        Battle pokemon4 = new Battle("Rintar",140,110,70,"butterfly","air","medium");
        Battle pokemon5 = new Battle("Valon",95,85,130,"dragon","fire","large");
        System.out.println("Choose pokemon :");
        System.out.println("1. Pikachu");
        System.out.println("2. Baltazar");
        System.out.println("3. Balrock");
        System.out.println("4. Rintar");
        System.out.println("5. Valon");
        System.out.print("Your choose : ");
        int n = in.nextInt();

        switch(n){
            case 1 :
                System.out.println("You have chosen Pikachu");
                pokemon1.battle(pokemon1,pokemon2);

        }
        

    }

}
