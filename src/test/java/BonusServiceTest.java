import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void testRegisteredUnderLimit() {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calcBonus(5000, true);
        //System.out.println("1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
