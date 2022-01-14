package com.company;
import java.util.ArrayList;


public class InitializationGame extends PokemonTools {

    public ArrayList<Pokemon>playerPokemon(){

        ArrayList<Pokemon>pokemonList = new ArrayList<>();
        PlayerPokemon pokemon1 = new PlayerPokemon("Pikachu",100,50,50,"mouse", TypePokemon.ELECTRIC,SizePokemon.SMALL);
        PlayerPokemon pokemon2 = new PlayerPokemon("Baltazar",200,30,70,"turtle",TypePokemon.WATER,SizePokemon.MEDIUM);
        PlayerPokemon pokemon3 = new PlayerPokemon("Balrock",90,60,45,"bull",TypePokemon.EARTHQUAKE,SizePokemon.LARGE);
        PlayerPokemon pokemon4 = new PlayerPokemon("Rintar",140,110,70,"butterfly",TypePokemon.AIR,SizePokemon.MEDIUM);
        PlayerPokemon pokemon5 = new PlayerPokemon("Valon",95,85,130,"dragon",TypePokemon.FIRE,SizePokemon.LARGE);
        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        pokemonList.add(pokemon3);
        pokemonList.add(pokemon4);
        pokemonList.add(pokemon5);

        return pokemonList;

    }
    public ArrayList<Pokemon>computerPokemonList(){

        ArrayList<Pokemon>computerPokemonList = new ArrayList<>();
        ComputerPokemon pcPokemon1 = new ComputerPokemon("Raichy",80,60,30,"mouse",TypePokemon.ELECTRIC,SizePokemon.MEDIUM);
        ComputerPokemon pcPokemon2 = new ComputerPokemon("Snake",100,150,10,"snake",TypePokemon.WATER,SizePokemon.LARGE);
        ComputerPokemon pcPokemon3 = new ComputerPokemon("Sentret",80,60,15,"mouse",TypePokemon.STEEL,SizePokemon.SMALL);
        ComputerPokemon pcPokemon4 = new ComputerPokemon("Stunky",50,60,10,"cat",TypePokemon.PSYCHIC,SizePokemon.MEDIUM);
        ComputerPokemon pcPokemon5 = new ComputerPokemon("Tepig",140,110,150,"pig",TypePokemon.GRASS,SizePokemon.LARGE);
        computerPokemonList.add(pcPokemon1);
        computerPokemonList.add(pcPokemon2);
        computerPokemonList.add(pcPokemon3);
        computerPokemonList.add(pcPokemon4);
        computerPokemonList.add(pcPokemon5);

        return computerPokemonList;

    }
}
