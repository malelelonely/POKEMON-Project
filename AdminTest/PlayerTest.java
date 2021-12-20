import com.company.Pokemon;
import org.junit.Test;import static java.util.Arrays.asList;import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;
import java.util.Arrays;


public class PlayerTest {
    @Test
    public void PlayerTest(){
        ArrayList<Pokemon> actual = new ArrayList<>(5);
        ArrayList<Pokemon> expected = new ArrayList<>(5);

        Arrays.equals(actual.toArray(),expected.toArray());

    }


    }

