import com.company.Pokemon;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ComputerTeamPokemonTest {
    @Test
    public void ComputerTeamPokemonTest(){
        ArrayList<Pokemon> actual = new ArrayList<>(5);
        ArrayList<Pokemon> expected = new ArrayList<>(5);

        Arrays.equals(actual.toArray(),expected.toArray());

    }
}
