package planet.structure;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import planet.test.PlanetCompulsoryTest;

@Suite
@SelectClasses({
    PlanetCompulsoryStructureTest.class,
    PlanterCompulsoryStructureTest.class,
    PlanetCompulsoryTest.class,
})
public class PlanetCompulsoryTestSuite {}
