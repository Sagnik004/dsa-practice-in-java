package practicetopics;

// https://www.hackerrank.com/challenges/java-factory/problem?isFullScreen=true
public class Ex02BasicJavaFactoryPattern {

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food order = foodFactory.getFood("Pizza");
        System.out.println(order.getType());

        order = foodFactory.getFood("Cake");
        System.out.println(order.getType());
    }
}

interface Food {

    public String getType();
}

class Pizza implements Food {

    @Override
    public String getType() {
        return "The factory returned class Pizza\n" +
                "Someone ordered Fast Food!";
    }
}

class Cake implements Food {

    @Override
    public String getType() {
        return "The factory returned class Cake\n" +
                "Someone ordered a Dessert!";
    }
}

class FoodFactory {

    public Food getFood(String food) {
        return food.equalsIgnoreCase("pizza") ? new Pizza() : new Cake();
    }
}
