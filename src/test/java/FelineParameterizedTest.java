import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

  private final int kittensNum;
  private final int expected;

  public FelineParameterizedTest(int kittensNum, int expected) {
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
