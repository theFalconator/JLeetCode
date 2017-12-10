package hashtables;

import org.junit.Test;

import static org.junit.Assert.*;
import static hashtables.GroupingDishes.groupingDishes;

public class GroupingDishesTest {

    @Test
    public void sampleTest1() {
        groupingDishes(
                new String[][]{{"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                        {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                        {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                        {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}}
        );
    }
}