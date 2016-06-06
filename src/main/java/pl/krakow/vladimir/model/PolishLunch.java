package pl.krakow.vladimir.model;

import lombok.Data;

/**
 * Created by vladimir on 06.06.2016.
 */
@Data
public class PolishLunch implements Food {
    @Override
    public int getPrice() {
        return 11;
    }

    @Override
    public String getName() {
        return "Żurek";
    }

    @Override
    public String toString() {
        return getName();
    }
}
