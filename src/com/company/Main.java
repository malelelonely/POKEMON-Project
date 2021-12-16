package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Pokemon>pokemonList = new ArrayList<>();
        PlayerPokemon pokemon1 = new PlayerPokemon("Pikachu",100,50,50,"mouse","electric","small");
        PlayerPokemon pokemon2 = new PlayerPokemon("Baltazar",200,30,70,"turtle","water","medium");
        PlayerPokemon pokemon3 = new PlayerPokemon("Balrock",90,60,45,"bull","earthquake","large");
        PlayerPokemon pokemon4 = new PlayerPokemon("Rintar",140,110,70,"butterfly","air","medium");
        PlayerPokemon pokemon5 = new PlayerPokemon("Valon",95,85,130,"dragon","fire","large");
        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        pokemonList.add(pokemon3);
        pokemonList.add(pokemon4);
        pokemonList.add(pokemon5);
        ArrayList<Pokemon>computerPokemonList = new ArrayList<>();
        ComputerPokemon pcPokemon1 = new ComputerPokemon("Raichy",80,60,15,"mouse","electric","medium");
        ComputerPokemon pcPokemon2 = new ComputerPokemon("Snake",100,150,10,"snake","water","large");
        ComputerPokemon pcPokemon3 = new ComputerPokemon("Sentret",80,60,15,"mouse","electric","medium");
        ComputerPokemon pcPokemon4 = new ComputerPokemon("Stunky",50,60,100,"cat","air","medium");
        ComputerPokemon pcPokemon5 = new ComputerPokemon("Tepig",140,30,150,"pig","earthquake","medium");
        computerPokemonList.add(pcPokemon1);
        computerPokemonList.add(pcPokemon2);
        computerPokemonList.add(pcPokemon3);
        computerPokemonList.add(pcPokemon4);
        computerPokemonList.add(pcPokemon5);
        System.out.println("Choose pokemon :");
        System.out.println("1. Pikachu");
        System.out.println("2. Baltazar");
        System.out.println("3. Balrock");
        System.out.println("4. Rintar");
        System.out.println("5. Valon");
        Scanner in = new Scanner(System.in);
        System.out.print("Your choose : ");
        int n,b,c;

//        switch(n){
//            case 1 :
//                System.out.println("You have chosen :");
//                pokemon1.battle(pokemon1,pokemon2);
//
//            while (!in.hasNextInt()) {
//
//                System.out.println("That's not a number!");
//                in.next();
//            }
          n = in.nextInt();
          b = in.nextInt();
          c = in.nextInt();
//        } while (n <= 0 || n>6|| b <= 0 || b>6|| c <= 0 || c>6 );
        System.out.println("Thank you for choose : " + n+ ","+ b+ ","+ c);
        ArrayList<Pokemon> playerPokemons = new ArrayList<>();
        playerPokemons.add(pokemonList.get(n-1));
        playerPokemons.add(pokemonList.get(b-1));
        playerPokemons.add(pokemonList.get(c-1));
        Player player = new Player(0, playerPokemons);
        System.out.println("You have chosen " + pokemonList.get(n - 1).name);
        Battle.tournament(player, computerPokemon);
        System.out.println();

    }

}
