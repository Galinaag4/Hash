import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private static final Random random = new Random();
    private static void printRandomMultiplicationTable(int from, int to, int count) {
        // количество всех цифр таблицы умножения
        int n = Math.abs(to + 1 - from);
        // максимальное количество возможных вариантов примеров
        // сумма арифметической прогрессии от 1 до n
        int maxCount = (1 + n) * n / 2;
        if (count > maxCount) {
            count = maxCount;
        }
    HashSet<String> set = new HashSet<>();
            while (set.size() != count) {
            int n1 = randomInt(from, to);
            int n2 = randomInt(n1, to);
            set.add(String.format("%d*%d", n1, n2));
        }
        for (String e : set) {
            System.out.println(e);
        }
    }

    private static int randomInt(int from, int to) {
        ++to;
        to -= from;
        return random.nextInt(to) + from;
    }

    public static void main(String[] args) {
        var forBorsch = new ProductList();
        forBorsch.addProduct("Говядина", 600f, 0.5f);
        forBorsch.addProduct("Картофель", 39.90f, 0.5f);
        forBorsch.addProduct("Морковь", 49.90f, 0.2f);
        forBorsch.addProduct("Лук", 19.90f, 0.2f);
        forBorsch.addProduct("Томаты", 119.90f, 0.6f);
        forBorsch.addProduct("Капуста", 46.90f, 0.4f);
        var borsch = new Recept("Борщ", forBorsch);
        System.out.println(forBorsch);
        forBorsch.deleteProduct("Картофель");
        forBorsch.deleteProduct("Карто");
        forBorsch.markAsBought("Говядина");
        forBorsch.setWeight("Говядина", 0.3f);
        System.out.println(forBorsch);



      /*  var forMeatBall = new ProductList();
        forMeatBall.addProduct("Свинина", 450f, 0.3f);
        forMeatBall.addProduct("Яйца", 150f, 0.07f);
        forMeatBall.addProduct("Манная крупа", 79.90f, 0.05f);
        forMeatBall.addProduct("Лук", 19.90f, 0.1f);
        var meatBall = new Recipe("Фрикадельки", forMeatBall);
        var meatBalls = new Recipe("Мясные шарики", forMeatBall);
        var meatBalls2 = new Recipe("Мясные шарики", forBorsch);
        var recipeList = new RecipeList();
        recipeList.addRecipe(borsch);
        recipeList.addRecipe(meatBalls);
        recipeList.addRecipe(meatBall);
        recipeList.addRecipe(meatBalls2);
        System.out.println(recipeList);*/
    }
    }



















