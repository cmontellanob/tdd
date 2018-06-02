import org.junit.Test;
import static org.junit.Assert.*;

public class PersistTest3 {
    @Test
    public void persistencestetforNumer657() {
        int result= Persist.persistence(657);
        assertEquals(2,result);
    }
}
