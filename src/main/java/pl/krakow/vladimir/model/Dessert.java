package pl.krakow.vladimir.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by vladimir on 06.06.2016.
 */
@Data
@AllArgsConstructor
public class Dessert implements Food{

    String name;

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getName() {
        return "Cheesecake";
    }

    @Override
    public String toString() {
        return getName();
    }
}
