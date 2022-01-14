import com.company.*;
import org.junit.Test;

public class BattleTest {

    @Test
    public void battleTest(){
        Battle battle = new Battle();
        PlayerPokemon pokemon1 = new PlayerPokemon("Pikachu",100,50,50,"mouse", TypePokemon.ELECTRIC, SizePokemon.SMALL);
        ComputerPokemon pcPokemon1 = new ComputerPokemon("Raichy",80,60,15,"mouse",TypePokemon.ELECTRIC,SizePokemon.MEDIUM);
         //int actualResult = Battle.battle(pokemon1,pcPokemon1);
        int expectedResult = 1;
        assert equals(1);



    }
    @Test
    public void tournamentTest(){


    }
}
