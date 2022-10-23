import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recept> recipes = new HashSet<>();
    public void addRecipe(Recept recipe) {
        if (!recipes.add(recipe)) {
            System.out.println("Такой рецепт есть в списке");
            throw new IllegalArgumentException();
        }
    }

    public void addRecipe(String name, ProductList pl) {
        Recept temp = new Recept(name, pl);
        addRecipe(temp);
    }

    @Override
    public String toString() {
        var sb = new  StringBuilder();
        for (Recept recipe : recipes) {
            sb.append(recipe.toString());
        }
        return sb.toString();
    }
}

