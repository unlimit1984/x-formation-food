package pl.krakow.vladimir.model;

import lombok.Data;

/**
 * Created by vladimir on 06.06.2016.
 * UNDER CONSTRUCTION
 */
@Data
public class Drink implements Food{

    boolean ice;
    boolean lemon;

    @Override
    public int getPrice() {
        return 6;
    }

    @Override
    public String getName() {
        return "Tea";
    }

    @Override
    public String toString() {
        return getName();
    }
}
