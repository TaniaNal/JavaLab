
package manager;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

import birds.*;
import enums.BirdType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class ZooManagerTest {
    private ZooManager zooManager;

    private static final BirdsWriter writer = new BirdsWriter();
    private static final File file = new File ("E:\\foo\\work71");
    @BeforeEach
    void setUp() {
        zooManager = new ZooManager();

        zooManager.addBird(new Sparrow( 8, 6));
        zooManager.addBird(new Stock( 6, 89, 56));
        zooManager.addBird(new Duck( 2, 5));
    }

    @Test
    void testGetLength() {
        Sparrow sparrow = new Sparrow( 8, 10);
        assumingThat(sparrow != null, () -> assertEquals(8, sparrow.getLengthOfWings()));
    }

    @Test
    void testGetWeight() {
        Sparrow sparrow = new Sparrow( 8, 10);
        assumingThat(sparrow != null, () -> assertEquals(10, sparrow.getWeight()));
    }

    @Test
    void testFindBird() {
        setUp();
        List<String> someDeparting = new LinkedList<>();

        List<Bird> result = zooManager.searchDepartingBirds(BirdType.DUCK, BirdType.SPARROW);

        assertEquals(6, result.get(0).getWeight());
        assertEquals(5, result.get(1).getWeight());
    }
    @Test
    public void testWriter() {
        BirdsWriter writer = new BirdsWriter();
        try {
            writer.writeToFile(zooManager.getBirds());
        } catch(Exception e) {
            assertFalse(false, "Unexpected exception was thrown");
        }
    }

    @AfterEach
    void tearDown() {
        zooManager = null;
    }
}
