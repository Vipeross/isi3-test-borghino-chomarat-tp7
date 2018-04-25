import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class PersonTest {

    @Test
    public void move() {
        Person person;

        Vector defaultPosition = mock(Vector.class);
        Vector deplacement = mock(Vector.class);
        Vector position = new Vector(1,1);

        when(defaultPosition.add(deplacement)).thenReturn(position);

        person = new Person("John Doe", defaultPosition);

        person.move(deplacement);

        assertEquals(position, person.getPosition());
        verify(defaultPosition).add(deplacement);
    }


    @Test
    public void reset() {
        Person person;
        Vector defaultPosition = mock(Vector.class);
        person = new Person("John",defaultPosition);

        person.reset();

        verify(defaultPosition).reset();
    }

}