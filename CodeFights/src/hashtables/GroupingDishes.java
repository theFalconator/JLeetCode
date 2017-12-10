package hashtables;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingDishes {


    public static String[][] groupingDishes(String[][] dishes) {
        Map<String, List<String>> ingredientMap = new HashMap<>();

        for(String[] line : dishes) {
            List<String> ingredients = new ArrayList<>();
            ingredients.addAll(Arrays.asList(line).subList(1, line.length));
            ingredientMap.put(line[0], ingredients);
        }

        Map<String, List<String>> result = new HashMap<>();
        Stream<String> ingredientStream = ingredientMap.values().stream().flatMap(Collection::stream);
        Set<String> ingredients = new HashSet<>();
        ingredientStream.forEach(ingredients::add);

        for(String i : ingredients) {
            System.out.println(i);
        }

        System.out.println("------------------------");


        for(String i : ingredients) {
            List<String> recipesUsingIngredient = new ArrayList<>();
            for(String recipe : ingredientMap.keySet()) {
                if(ingredientMap.get(recipe).contains(i)) {
                    recipesUsingIngredient.add(recipe);
                }
            }
            result.put(i, recipesUsingIngredient);
        }

        for(String key : result.keySet()) {
            if(result.get(key).stream().count() >= 2) {
                System.out.println(key);

                for(String i : result.get(key)) {
                    System.out.println("\t"+i);
                }
            }

        }

        return new String[][] {};
    }
}
