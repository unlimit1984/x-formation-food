package pl.krakow.vladimir.model;

import lombok.Data;

/**
 * Created by vladimir on 06.06.2016.
 */
@Data
public class MexicanLunch implements Food {
    @Override
    public int getPrice() {
        return 14;
    }

    @Override
    public String getName() {
        return "Burrito";
    }

    @Override
    public String toString() {
        return getName();
    }
}
