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

    }

}
