package planet.structure;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import planet.test.PlanterExtendedTest;
import planet.test.PlanetExtendedTest;

@Suite
@SelectClasses({
    PlanterExtendedStructureTest.class,
    PlanterExtendedTest.class,
    PlanetCompulsoryTestSuite.class,
    PlanetExtendedTest.class
})
public class PlanetFullTestSuite {}
