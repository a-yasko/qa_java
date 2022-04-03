import com.example.LionAlex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex lionAlex = new LionAlex();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = lionAlex.getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex lionAlex = new LionAlex();
        String expected = "Нью-Йоркский зоопарк";
        String actual = lionAlex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        LionAlex lionAlex = new LionAlex();
        int expected = 0;
        int actual = lionAlex.getKittens();
        assertEquals(expected, actual);
    }
}
