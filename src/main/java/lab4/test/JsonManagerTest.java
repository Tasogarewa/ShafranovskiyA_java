package lab4.test;

import lab4.controller.JsonManager;
import lab4.model.University;
import lab4.controller.creators.UniversityCreator;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class JsonManagerTest {

    @Test
    public void testUniversitySerializationDeserialization() throws IOException {
        University oldUniversity = UniversityCreator.createTypicalUniversity();

        String filePath = "university.json";

        JsonManager.writeToFile(oldUniversity, filePath);
        University newUniversity = JsonManager.readFromFile(filePath);

        assertEquals(oldUniversity, newUniversity);
    }
}