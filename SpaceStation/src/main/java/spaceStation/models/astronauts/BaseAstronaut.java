package spaceStation.models.astronauts;

import spaceStation.models.bags.Bag;

import static spaceStation.common.ExceptionMessages.ASTRONAUT_NAME_NULL_OR_EMPTY;
import static spaceStation.common.ExceptionMessages.ASTRONAUT_OXYGEN_LESS_THAN_ZERO;

public abstract class BaseAstronaut implements Astronaut{
    private String name;
    private double oxygen;
    private Bag bag;


    public BaseAstronaut(String name, double oxygen) {
        this.name = getName();
        this.oxygen = getOxygen();
    }

    @Override
    public String getName() {
        if (name.trim().isEmpty()||name == null){
            throw new NullPointerException(ASTRONAUT_NAME_NULL_OR_EMPTY);
        }
        return this.name;
    }

    @Override
    public double getOxygen() {
        if (oxygen<0){
            throw new IllegalArgumentException(ASTRONAUT_OXYGEN_LESS_THAN_ZERO);
        }
        return oxygen;
    }

    @Override
    public boolean canBreath() {
        return oxygen>=0;
    }

    @Override
    public Bag getBag() {
        return this.bag;
    }
    @Override
    public void breath() {
        oxygen -= 10;
    }

}
