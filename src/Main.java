//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Orders");
        Pizza.setOrder(PizzaCategory.CHEESE, PizzaSize.SMALL, 8);
        Pizza.setOrder(PizzaCategory.CHICKEN, PizzaSize.LARGE,1);

        System.out.println("\nTotal amount: "+Pizza.getTotalCount());
    }
}