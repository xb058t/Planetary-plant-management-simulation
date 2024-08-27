package planet.test;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.CheckThat;

import planet.Planet;
import planet.plant.Planter;

public class PlanetCompulsoryTest {
    @Test
    public void testInit() {
        Planet earth = Planet.EARTH;
        assertEquals(100, earth.getPlantCount());

        Planet mercury = Planet.MERCURY;
        assertEquals(0, mercury.getPlantCount());

        Planet venus = Planet.VENUS;
        assertEquals(0, venus.getPlantCount());

        Planet mars = Planet.MARS;
        assertEquals(0, mars.getPlantCount());

        Planet jupiter = Planet.JUPITER;
        assertEquals(0, jupiter.getPlantCount());

        Planet saturn = Planet.SATURN;
        assertEquals(0, saturn.getPlantCount());

        Planet uranus = Planet.URANUS;
        assertEquals(0, uranus.getPlantCount());

        Planet neptune = Planet.NEPTUNE;
        assertEquals(0, neptune.getPlantCount());
    }

    @Test
    public void testAddPlant() {
        Planter planter = new Planter();
        planter.addPlant(Planet.EARTH);
        assertEquals(101, planter.getPlantCount(Planet.EARTH));
    }

    @Test
    public void testGrowOnEarth() {
        Planter planter = new Planter();
        planter.growPlants();
        assertEquals(200, planter.getPlantCount(Planet.EARTH));
    }

    @Test
    public void testGrowMoveThenGrow() {
        Planter planter = new Planter();
        planter.movePlants(30, Planet.EARTH, Planet.MARS);
        planter.movePlants(20, Planet.EARTH, Planet.NEPTUNE);
        planter.movePlants(15, Planet.MARS, Planet.NEPTUNE);
        planter.growPlants();
        assertEquals(50, planter.getPlantCount(Planet.EARTH));
        assertEquals(15, planter.getPlantCount(Planet.MARS));
        assertEquals(70, planter.getPlantCount(Planet.NEPTUNE));
    }
}