import org.junit.Test;
import static org.junit.Assert.*;

public class PersistTest2 {
    @Test
    public void persistencestetforNumer39() {
        int result= Persist.persistence(39);
        assertEquals(3,result);
    }
}

