import org.junit.Test;
import static org.junit.Assert.*;

public class PersistTest {
    @Test
    public void persistencestetforNumer2() {
       int result= Persist.persistence(2);
        assertEquals(0,result);
    }
}

