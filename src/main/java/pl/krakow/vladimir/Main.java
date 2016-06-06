package pl.krakow.vladimir;

import pl.krakow.vladimir.model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome in our Restaurant's ordering system");
        Order order = null;
        while (true) {
            System.out.println("*******************");
            if (order == null) {
                System.out.println("Create order");
                order = new Order();
            } else {
                System.out.println("Added order " + order);
                System.out.println("Changing order");
            }

            System.out.println("1. Lunch");
            System.out.println("2. Dessert");
            System.out.println("3. Drink");
            System.out.println("f: Finish current order");
            System.out.println("q: Quit");
            System.out.print("Your choice: ");
            Scanner scanner = new Scanner(System.in);

            String command = scanner.next();
            if (command.equalsIgnoreCase("Q")) {
                System.out.println("Thanks for using our Restaurant's ordering system. Good luck!");
                Thread.sleep(1000);
                break;
            } else if (command.equalsIgnoreCase("1")) {
                while (true) {
                    System.out.println("*******************");
                    if (order.getMain() != null) {
                        System.out.println("Added " + order.getMain());
                        System.out.println("Change cuisine?");
                    } else {
                        System.out.println("Choose cuisine");
                    }

                    System.out.println("1: Polish");
                    System.out.println("2: Mexican");
                    System.out.println("3: Italian");
                    System.out.println("b: Back");
                    System.out.print("Your choice: ");
                    String cuisine = scanner.next();
                    if (cuisine.equals("1")) {
                        order.setMain(new PolishLunch());
                        break;
                    } else if (cuisine.equals("2")) {
                        order.setMain(new MexicanLunch());
                        break;
                    } else if (cuisine.equals("3")) {
                        order.setMain(new ItalianLunch());
                        break;
                    } else if (cuisine.equalsIgnoreCase("b")) {
                        break;
                    }
                }
            }else if(command.equalsIgnoreCase("2")){
                while (true) {
                    System.out.println("*******************");
                    if (order.getDessert() != null) {
                        System.out.println("Added " + order.getDessert());
                        System.out.println("Change dessert?");
                    } else {
                        System.out.println("Choose desert");
                    }
                    System.out.println("1: Cheesecake");
                    System.out.println("2: Pudding");
                    System.out.println("3: Jelly");
                    System.out.println("b: Back");
                    System.out.print("Your choice: ");
                    String dessert = scanner.next();
                    if (dessert.equals(1)) {
                        order.setDessert(new Dessert("Cheesecake"));
                        break;
                    } else if(dessert.equalsIgnoreCase("2")){
                        order.setDessert(new Dessert("Pudding"));
                        break;
                    } else if(dessert.equalsIgnoreCase("3")){
                        order.setDessert(new Dessert("Jelly"));
                        break;
                    } else if(dessert.equalsIgnoreCase("b")){
                        break;
                    }
                }
            } else if (command.equalsIgnoreCase("3")) {
                while (true) {
                    System.out.println("*******************");
                    if (order.getDrink() != null) {
                        System.out.println("Added " + order.getDrink());
                        System.out.println("Change drink?");
                    } else {
                        System.out.println("Choose drink");
                    }
                    System.out.println("1: Tea");
                    System.out.println("b: Back");
                    System.out.print("Your choice: ");
                    String drink = scanner.next();
                    if (drink.equals("1")) {
                        order.setDrink(new Drink());
                        break;
                    } else if(drink.equalsIgnoreCase("b")){
                        break;
                    }
                }
            } else if(command.equalsIgnoreCase("f")){
                System.out.println("*******************");
                if(order!=null) {
                    System.out.println(order);
                    System.out.println("Payments: " + order.getPayments() + " PLN");
                    order=null;
                }
            }
        }
    }
}
