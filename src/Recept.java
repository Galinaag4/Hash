import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recept {

    private String nameRecept;
    private int priceAll;
    Set<Recept> recept=new HashSet<>();

    public String getNameRecept() {
        return nameRecept;
    }

    public int getPriceAll() {
        return priceAll;
    }

    public Set<Recept> getRecept() {
        return recept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recept)) return false;
        Recept recept1 = (Recept) o;
        return getPriceAll() == recept1.getPriceAll() && Objects.equals(getNameRecept(), recept1.getNameRecept()) && Objects.equals(getRecept(), recept1.getRecept());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameRecept(), getPriceAll(), getRecept());
    }
}
