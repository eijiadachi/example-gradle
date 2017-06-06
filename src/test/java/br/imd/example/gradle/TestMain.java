import org.junit.Test;
import br.imd.example.gradle.Main;
import static org.junit.Assert.*;

public class TestMain {

    @Test
    public void testConcatenate() {
        Main m = new Main();

        String result = m.greet();

        assertEquals("Fala, galado!", result);

    }
}