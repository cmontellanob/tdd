import org.junit.Test;
import static org.junit.Assert.*;

public class PersistTest5 {
    @Test
    public void persistencestetforNumer5123() {
        int result= Persist.persistence(15123);
        assertEquals(2,result);
    }
}

