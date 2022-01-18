import com.company.*;
import org.junit.Assert;
import org.junit.Test;

public class BattleTest {

    @Test
    public void battleTestPlayer(){

         PlayerPokemon pokemon1 = new PlayerPokemon("Pikachu",100,50,50,"mouse", TypePokemon.ELECTRIC, SizePokemon.SMALL);
         ComputerPokemon pcPokemon1 = new ComputerPokemon("Raichy",80,60,15,"mouse",TypePokemon.ELECTRIC,SizePokemon.MEDIUM);
         int actualResult = Battle.battle(pokemon1,pcPokemon1);
         int expectedResult = 1;
         String msg = "Error in battle Pickachy vs Raichy !";
         Assert.assertEquals(msg,expectedResult,actualResult);



    }



    @Test
    public void battleTestComputer(){
        Battle battle = new Battle();
        PlayerPokemon pokemon2 = new PlayerPokemon("Baltazar",200,30,70,"turtle",TypePokemon.WATER,SizePokemon.MEDIUM);
        ComputerPokemon pcPokemon2 = new ComputerPokemon("Snake",100,150,10,"snake",TypePokemon.WATER,SizePokemon.LARGE);
        //int expetedResult = Battle.battle(pokemon2,pcPokemon2);
        assert equals(1);



    }
}
