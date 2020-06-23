import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VisitorTest {

    @Test
    void save()throws IOException {
        assertEquals("Successfully wrote to the file",Visitor.Save(""));
    }
    @Test
    void load() throws IOException {
        assertSame(Visitor.load("relow Malepa"));

    }

    private void assertSame(String relow_malepa) {
    }
}