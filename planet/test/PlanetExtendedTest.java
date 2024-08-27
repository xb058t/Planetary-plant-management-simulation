package planet.test;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.CheckThat;
import java.util.Arrays;

import planet.Planet;
import planet.plant.Planter;

public class PlanetExtendedTest {
    @Test
    public void testInit2() {
        int[] plantCounts = {1,2,3,4,5,6,7,8};
        Planter planter = new Planter(plantCounts);

        planter.growPlants();
        
        int[] checkCounts = {1,2,6,4,5,6,7,8};
        assertArrayEquals(checkCounts, planter.getPlantCounts());
    }

    @Test
    public void testEncapsulation() {
        int[] counts = {1,2,3,4,5,6,7,8};

        // i. test that the counts array contains 1,2,3,4,5,6,7,8
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, counts);

        // ii. start the planets passing this array in
        Planter planter = new Planter(counts);
        assertArrayEquals(counts, planter.getPlantCounts());

        // iii. modify an element of counts to 100
        counts[0] = 100;
        assertEquals(100, counts[0]);

        // iv. get the number of plants to the counts2 variable
        int[] counts2 = planter.getPlantCounts();
        assertFalse(Arrays.equals(counts, counts2)); // FALSE as we changed 0th element

        // v. overwrite an element of counts2 to 200
        counts2[0] = 200;
        assertEquals(200, counts2[0]);
        assertFalse(Arrays.equals(planter.getPlantCounts(), counts2)); // FALSE as we changed 0th element
    }

    @Test
    public void testInit3() {
        int[] counts = {1,2,3,4,5,6,7,8};
        Planet planet = Planet.JUPITER;

        Planter planter = new Planter(counts, planet);
        assertArrayEquals(counts, planter.getPlantCounts());

        planter.growPlants();
        int[] checkCounts = {1,2,3,4,10,6,7,8};
        int[] planetCounts = planter.getPlantCounts();
        assertArrayEquals(checkCounts, planetCounts);
    }
}