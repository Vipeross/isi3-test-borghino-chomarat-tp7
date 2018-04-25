import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTest {

    private Vector firstVector;

    private Vector secondVector;


    @Test
    public void add() {
        firstVector = new Vector(1, 2);
        secondVector = new Vector(3, 3);

        assertEquals(new Vector(4, 5), firstVector.add(secondVector));
    }

    @Test
    public void addNegatives() {
        firstVector = new Vector(1, -7);
        secondVector = new Vector(-1, -8);

        assertEquals(new Vector(0, -15), firstVector.add(secondVector));
    }

    @Test
    public void cross() {
        firstVector = new Vector(1, 2);
        secondVector = new Vector(3, 3);

        assertEquals(-3, firstVector.cross(secondVector));
    }

    @Test
    public void crossNegatives() {
        firstVector = new Vector(-11, -2);
        secondVector = new Vector(-4, 3);

        assertEquals(-33 - 8, firstVector.cross(secondVector));
    }

    @Test
    public void reset() throws Exception {
        firstVector = new Vector(1000, 1000);
        firstVector.reset();
        assertEquals(new Vector(0,0), firstVector);
    }
}