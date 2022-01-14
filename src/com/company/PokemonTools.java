package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PokemonTools{
 PokemonTools pokemonTools;
 InitializationGame initializationGame;

    public static  String[] pokeTitle = {
            "                               .::.                           ",
            "                              .;:**'                          ",
            "                              `                               ",
            "  .:XHHHHk.              db.   .;;.     dH  MX                ",
            "oMMMMMMMMMMM       ~MM  dMMP :MMMMMR   MMM  MR      ~MRMN     ",
            "QMMMMMb  'MMX       MMMMMMP !MX' :M~   MMM MMM  .oo. XMMM 'MMM",
            "  `MMMM.  )M> :X!Hk. MMMM   XMM.o'  .  MMMMMMM X?XMMM MMM>!MMP",
            "   'MMMb.dM! XM M'?M MMMMMX.`MMMMMMMM~ MM MMM XM `' MX MMXXMM ",
            "    ~MMMMM~ XMM. .XM XM`'MMMb.~*?**~ .MMX M t MMbooMM XMMMMMP ",
            "     ?MMM>  YMMMMMM! MM   `?MMRb.    `MM   !L'MMMMM XM IMMM   ",
            "      MMMX   'MMMM'  MM       ~%:           !Mh.''' dMI IMMP  ",
            "      'MMM.                                             IMX   ",
            "       ~M!M                                             IM    "

    };

    private static String[] congrats = {
            " _____                             _         _       _   _                 _ ",
            "/  __ |                           | |       | |     | | (_)               | |",
            "| /  |/ ___  _ __   __ _ _ __ __ _| |_ _   _| | __ _| |_ _  ___  _ __  ___| |",
            "| |    / _ || '_ | / _` | '__/ _` | __| | | | |/ _` | __| |/ _ || '_ |/ __| |",
            "| |__/| (_) | | | | (_| | | | (_| | |_| |_| | | (_| | |_| | (_) | | | |__ |_|",
            " |____/|___/|_| |_||__, |_|  |__,_||__||__,_|_||__,_||__|_||___/|_| |_|___(_)",
            "                    __/ |                                                    ",
            "                   |___/                                                     \n"
    };
    private static String[] loser = {
            "__   __            _                    _         ",
            "\\ \\ / /           | |                  | |      ",
            " \\ V /___  _   _  | |     ___  ___  ___| |       ",
            "  \\ // _ \\| | | | | |    / _ \\/ __|/ _ \\ |    ",
            "  | | (_) | |_| | | |___| (_) \\__ \\  __/_|      ",
            "  \\_/\\___/ \\__,_| \\_____/\\___/|___/\\___(_) \n"
    };
   public static void printPokeTitle(){
       for (int i = 0; i < pokeTitle.length; i++) {
           System.out.println(pokeTitle[i]);
       }
   }
   public static void printCongrats(){
       for (int i = 0; i < congrats.length ; i++) {
           System.out.println(congrats[i]);
       }
   }
   public static void printLoser(){
       for (int i = 0; i < congrats.length ; i++) {
           System.out.println(congrats[i]);

       }
   }
    public void pokemonChoose(){
        System.out.println("                    Choose your three Pokemons :");
        System.out.println("1. Pikachu");
        System.out.println("2. Baltazar");
        System.out.println("3. Balrock");
        System.out.println("4. Rintar");
        System.out.println("5. Valon");
        Scanner in = new Scanner(System.in);
        System.out.print("Choose 3 Pokemons : ");
        Random random = new Random();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Your choice is : " + a+ ","+ b+ ","+ c);
        InitializationGame playerPokemonList = new InitializationGame();
        playerPokemonList.playerPokemon();
        InitializationGame computerPokomonList = new InitializationGame();
        computerPokomonList.computerPokemonList();
        ArrayList<Pokemon> playerPokemons = new ArrayList<>();
        playerPokemons.add(playerPokemonList.playerPokemon().get(a - 1));
        playerPokemons.add(playerPokemonList.playerPokemon().get(b - 1));
        playerPokemons.add(playerPokemonList.playerPokemon().get(c - 1));
        Player player = new Player(0, playerPokemons);
        ComputerTeamPokemon computerPokemonsTeams = new ComputerTeamPokemon(computerPokomonList.computerPokemonList());
        Battle tournament1 = new Battle();
        tournament1.tournament(player,computerPokemonsTeams);
    }


}


