package spaceStation.models.astronauts;

public class Meteorologist extends BaseAstronaut{
    private static double oxygen = 90;
    public Meteorologist(String name) {
        super(name, oxygen);
    }
}
