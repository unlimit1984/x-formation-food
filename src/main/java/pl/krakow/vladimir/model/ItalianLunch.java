package pl.krakow.vladimir.model;

import lombok.Data;

/**
 * Created by vladimir on 06.06.2016.
 */
@Data
public class ItalianLunch implements Food {
    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public String getName() {
        return "Pasta";
    }

    @Override
    public String toString() {
        return getName();
    }

}
