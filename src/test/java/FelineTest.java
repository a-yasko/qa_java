import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithDefaultParam() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    // Parametrized test
    private final int kittensNum;
    private final int expected;

    public FelineTest(int kittensNum, int expected) {
        this.kittensNum = kittensNum;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensNum() {
        return new Object[][] {
                { 10, 10},
                { 0, 0},
                { -1, -1},
                { 1000000000, 1000000000},
        };
    }

    @Test
    public void getKittensWithOtherParams() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensNum);
        assertEquals(expected, actual);
    }
}
