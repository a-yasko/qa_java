import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {
    // Parametrized test
    private final String male;
    private final boolean expected;

    public LionTest(String male, boolean expected) {
        this.male = male;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTypes() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false}
        };
    }

    @Test
    public void doesHaveManeWithValidParams() throws Exception {
        Lion lion = new Lion(male);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }
}
