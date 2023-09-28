// BasicPizza-luokka
class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}


// Täyteluokka
class Cheese extends ToppingDecorator {
    public Cheese(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return tempPizza.getCost() + 1.00;
    }
}

// Täyteluokka
class Tomato extends ToppingDecorator {
    public Tomato(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato";
    }

    public double getCost() {
        return tempPizza.getCost() + 0.50;
    }
}

// Pääluokka
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        System.out.println("Ingredients: " + basicPizza.getDescription() + ", Price: " + basicPizza.getCost());

        Pizza cheesePizza = new Cheese(basicPizza);
        System.out.println("Ingredients: " + cheesePizza.getDescription() + ", Price: " + cheesePizza.getCost());

        Pizza tomatoCheesePizza = new Tomato(cheesePizza);
        System.out.println("Ingredients: " + tomatoCheesePizza.getDescription() + ", Price: " + tomatoCheesePizza.getCost());
    }
}
