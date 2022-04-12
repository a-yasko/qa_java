import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
  private final String male;
  private final boolean expected;

  public LionParameterizedTest(String male, boolean expected) {
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
    Lion lion = new Lion(male, new Feline());
    boolean actual = lion.doesHaveMane();
    assertEquals(expected, actual);
  }
}
