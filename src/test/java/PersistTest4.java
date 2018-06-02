import org.junit.Test;
import static org.junit.Assert.*;

public class PersistTest4 {
    @Test
    public void persistencestetforNumer5123() {
        int result= Persist.persistence(5123);
        assertEquals(2,result);
    }
}

