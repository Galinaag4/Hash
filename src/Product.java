import java.util.Objects;

public class Product{

    private String name;
    private int price;
    private double ves;

    public Product(String name, int price, double ves) {
        this.name = name;
        this.price = price;
        this.ves = ves;
    }


    public void setName(String name) throws IllegalAccessException {
        if(name==null||name.isEmpty()){
            throw new IllegalAccessException("Нельзя добавить в корзину");}
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price)throws IllegalAccessException {
        if (price==0||price<0) {
            throw new IllegalAccessException("Заполните карточку полностью");}
            this.price = price;
        }


    public double getVes() {
        return ves;
    }

    public void setVes(double ves)throws IllegalAccessException {
        if (ves==0||ves<0) {
            throw new IllegalAccessException("Заполните карточку полностью");}
            this.ves = ves;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getPrice() == product.getPrice() && Double.compare(product.getVes(), getVes()) == 0 && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getVes());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ves=" + ves +
                '}';
    }


    }

