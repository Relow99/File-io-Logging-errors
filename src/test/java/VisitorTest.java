import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.zip.ZipError;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    @Test
    void save()throws IOException {
        assertEquals("Successfully wrote to the file",Visitor.Save(""));
    }
    @Test
    void load() {
        assertSame(Visitor.load("relow Malepa"));

    }
}