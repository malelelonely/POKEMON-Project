package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
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
        Scanner in = new Scanner(System.in);
        System.out.print("Your choose : ");
        int n = in.nextInt();
        //pokemon1.battle(pokemon1,pokemon2);
        switch(n){
            case 1 :
                System.out.println("You have chosen Pikachu");
                pokemon1.battle(pokemon1,pokemon2);

            while (!in.hasNextInt()) {

                System.out.println("That's not a number!");
                in.next();
            }
            n = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        } while (n <= 0 || n<6|| b <= 0 || b<6|| c <= 0 || c<6 );
        System.out.println("Thank you for choose : " + n+ ","+ b+ ","+ c);
        ArrayList<Pokemon> playerPokemons = new ArrayList<>();
        playerPokemons.add(pokemon[n]);
        playerPokemons.add(pokemon[b]);
        playerPokemons.add(pokemon[c]);
        Player player = new Player(0, playerPokemons);
        System.out.println("You have chosen " + pokemon[n - 1].name);
        Battle.tournament(player, pokemon);
        System.out.println();

    }

}
