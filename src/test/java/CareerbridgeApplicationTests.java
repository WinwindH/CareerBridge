import edu.nju.careerbridge.CareerbridgeApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CareerbridgeApplication.class)
public class CareerbridgeApplicationTests {

    @Test
    public void test(){

        assertEquals("hhh","h");
    }
}
