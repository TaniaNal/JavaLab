package Birds;

import Manager.ZooManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static Manager.ZooManager.printList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class SparrowTest {
    private Sparrow sparrow;

    @BeforeEach
    void setUp() {
        ZooManager tania = new ZooManager();

        List<Bird> arrayList = new LinkedList<>();
        arrayList.add(new Sparrow("Sparrow", 8, 6));
        arrayList.add(new Stock("Stock", 6, 89, 56));
        arrayList.add(new Sparrow("sparrow", 2, 5));

        tania.setBird(arrayList);

        System.out.println(" List of all birds;");
        System.out.println(" Search departing birds;");
        System.out.println(" Print list of birds sorted by weight;");

        printList(arrayList);

        List<String> someDeparting = new LinkedList<>();
        someDeparting.add("sparrow");
        someDeparting.add("Stock");

        List<Bird> arrayList1 = tania.searchDepartingBirds(someDeparting);
        System.out.println("Find departing birds " + someDeparting);
        System.out.println(arrayList1);

        System.out.println("\nSorted list:\n");
        tania.sortByWeight(tania.getBird());
        tania.getBird().forEach((Bird o1) -> System.out.println(o1.toString()));
    }

    @Test
    void testGetWeight() {
        sparrow = new Sparrow("No", 5, 4);
        assumingThat(sparrow != null, () -> assertEquals(4, sparrow.getWeight()));
    }

    @Test
    void testGetLength() {
        sparrow = new Sparrow("Yes", 80, 10);
        assumingThat(sparrow != null, () -> assertEquals(80, sparrow.getLengthOfWings()));
    }

    @AfterEach
    void tearDown() {
        sparrow = null;
    }



}
