package planet;

public enum Planet {
    MERCURY(0),
    VENUS(0),
    EARTH(100),
    MARS(0),
    JUPITER(0),
    SATURN(0),
    URANUS(0),
    NEPTUNE(0);

    private final int plantCount;

    Planet(int plantCount) {
        this.plantCount = plantCount;
    }

    public int getPlantCount() {
        return plantCount;
    }
}