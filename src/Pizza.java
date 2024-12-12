import java.util.ArrayList;
import java.util.List;

public class Pizza {

    static List<PizzaCategory> pizzaCategoryList = new ArrayList<>();

    // SET ORDER
    public static void setOrder(PizzaCategory pizzaCategory, PizzaSize pizzaSize, int quantity) {
        System.out.println("Category: " + pizzaCategory + "\t Size: " + pizzaSize + "\t Quantity: " + quantity);
        for (int i = 0; i < quantity; i++) {
            pizzaCategoryList.add(pizzaCategory);
        }
    }

    // GET TOTAL COUNT
    public static double getTotalCount() {
        double totalCount = 0;

        for (PizzaCategory pizzaCategory1 : pizzaCategoryList) {
            if (pizzaCategory1.equals(PizzaCategory.CHEESE)) {
                totalCount += 12.99;
            } else if (pizzaCategory1.equals(PizzaCategory.PEPPERONI)) {
                totalCount += 11.99;
            } else if (pizzaCategory1.equals(PizzaCategory.VEGGIES)) {
                totalCount += 10.99;
            } else if (pizzaCategory1.equals(PizzaCategory.CHICKEN)) {
                totalCount += 20.99;
            }
        }

        return totalCount;
    }
}
