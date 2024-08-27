package planet.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import check.CheckThat;

public class PlanetCompulsoryStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("planet.Planet")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .hasEnumElements("MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN", "URANUS", "NEPTUNE");
    }
}

