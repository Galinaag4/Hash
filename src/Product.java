public class Product {
    private final String name;
    private Float cost;
    private boolean isBought = false;

    public Product(String name, Float cost) {
        if (name == null || name.isBlank()) {
            System.out.println("Заполните карточку товара полностью");
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
        setCost(cost);
    }

    public Float getName() {
        return cost;
    }

    public void setCost(Float cost) {
        if (cost == null || cost <= 0) {
            System.out.println("Заполните карточку товара полностью");
        }
    }

    public String setBought(boolean bought) {
        isBought = bought;
        if (isBought) {

        }
        return String.format("%s, %.2f руб., %c", name, cost);


    }

    public float getCost() {

        return 0;
    }
}




