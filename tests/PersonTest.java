import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    //Free Ride
    @Test
    public void testGettersPerson() {
        Person p = new Person("Veiga", 987654321);
        assertEquals(p.getName(), p.getName());
        assertEquals(p.getId(), p.getId());
    }

    //Local Hero
    @Test
    public void readFile() throws IOException {
        var fileLocation = "C:\\Users\\sr.jveiga\\Desktop\\test.txt";
        FileReader fr = new FileReader(fileLocation);
        int i;
        String s = "";
        while ((i=fr.read()) != -1)
            s += (char) i;
        assertEquals("I'm a file ready to be read.", s);
    }

    //Happy Path
    @Test
    public void testGetData() {
        Person p = new Person("Veiga", 987654321);
        assertEquals("Veiga987654321", p.getData());
    }

}