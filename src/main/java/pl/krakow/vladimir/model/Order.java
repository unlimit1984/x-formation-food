package pl.krakow.vladimir.model;

import lombok.Data;

/**
 * Created by vladimir on 06.06.2016.
 */
@Data
public class Order {
    Food main;
    Dessert dessert;
    Drink drink;

    @Override
    public String toString() {
        return "Order{" +
                "main cuisine=" + (main!=null ? main : "Empty")+
                ", dessert=" + (dessert!=null ? dessert : "Empty")+
                ", drink=" + (drink!=null ? drink : "Empty") +
                '}';
    }

    public int getPayments(){
        return  (main!=null ? main.getPrice() : 0) +
                (dessert!=null ? dessert.getPrice() : 0) +
                (drink!=null ? drink.getPrice() : 0);
    }
}
