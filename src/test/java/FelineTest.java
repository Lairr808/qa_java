import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    @Test
    public void felineEatsMeatTrue() throws Exception{
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(feline.eatMeat(), expectedResult);
    }

    @Test
    public void countLionIsOne(){
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
    @Test
    public void getKittensCountTest() {
        Feline feline = new Feline();
        int expectedLionCount = 3;
        int actualLionCount = feline.getKittens(3);
        assertEquals(expectedLionCount, actualLionCount);
    }

    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }
}


