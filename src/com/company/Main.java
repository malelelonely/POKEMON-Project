package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        PokemonTools.printPokeTitle();
        System.out.println("                 Welcome to the best Pokemon game!");
        Random random = new Random();
        InitializationGame playerPokemonList = new InitializationGame();
        playerPokemonList.playerPokemon();
        InitializationGame computerPokomonList = new InitializationGame();
        computerPokomonList.computerPokemonList();
        PokemonTools choose = new PokemonTools();
        choose.pokemonChoose();


        ArrayList<Pokemon> playerPokemons = new ArrayList<>();
        //playerPokemons.add(playerPokemonList.playerPokemon().get(a - 1);
        //playerPokemons.add(playerPokemonList.playerPokemon(n - 1).get(b - 1));
        //playerPokemons.add(playerPokemonList.playerPokemon(n - 1).get(c - 1));
        //Player player = new Player(0, playerPokemons);
        //ComputerTeamPokemon computerPokemonsTeams = new ComputerTeamPokemon(computerPokomonList.playerPokemon(n - 1));
        //System.out.println("You have chosen " + playerPokemonList.playerPokemon(n - 1));
        //Battle tournament1 = new Battle();
        //tournament1.tournament(player,computerPokemonsTeams );
        System.out.println();

    }

}
