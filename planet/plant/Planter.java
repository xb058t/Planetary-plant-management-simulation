package planet.plant;

import planet.Planet;

public class Planter {
    private int[] plantCounts = {
        Planet.MERCURY.getPlantCount(),
        Planet.VENUS.getPlantCount(),
        Planet.EARTH.getPlantCount(),
        Planet.MARS.getPlantCount(),
        Planet.JUPITER.getPlantCount(),
        Planet.SATURN.getPlantCount(),
        Planet.URANUS.getPlantCount(),
        Planet.NEPTUNE.getPlantCount()
    };
    private Planet planterLocation = Planet.EARTH;

    public Planter() {
        this.planterLocation = Planet.EARTH;
    }

    public Planter(int[] planetCounts) {
        this.planterLocation = Planet.EARTH;
        this.plantCounts = new int[planetCounts.length];
        for (int i = 0; i < planetCounts.length; i++) {
            this.plantCounts[i] = planetCounts[i];
        }
    }
    
    public Planter(int[] planetCounts, Planet planterLocation) {
        this.plantCounts = planetCounts;
        this.planterLocation = planterLocation;
    }

    public int[] getPlantCounts() {
        int[] copy = new int[plantCounts.length];
        for (int i = 0; i < plantCounts.length; i++)
            copy[i] = plantCounts[i];
        return copy;
    }

    public int getPlantCount(Planet planet) {
        return plantCounts[planet.ordinal()];
    }

    public void addPlant(Planet planet) {
        plantCounts[planet.ordinal()]++;
        planterLocation = planet;
    }

    public void growPlants() {
        plantCounts[planterLocation.ordinal()] *= 2;
    }

    public void growPlantsByDistanceFrom(Planet planet) {
        int distance = Math.abs(planet.ordinal() - planterLocation.ordinal());
        for (int i = 0; i < plantCounts.length; i++) {
            plantCounts[i] += distance;
        }
    }

    public void movePlants(int count, Planet from, Planet to) {
        if (plantCounts[from.ordinal()] < count) {
            throw new IllegalArgumentException("Not enough plants on " + from);
        }
        plantCounts[from.ordinal()] -= count;
        plantCounts[to.ordinal()] += count;
        this.planterLocation = to;
    }
}