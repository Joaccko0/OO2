package refactoring.ejercicio5;

import java.util.Date;
import java.util.List;

public class Bundle extends Product {

    private List<Product> subProducts;

    @Override
    public int startDate() {
        return this.subProducts.stream().mapToInt(e -> e.tripPeriod.start).min().orElse(-1);
    }

    @Override
    public int endDate() {
        return this.subProducts.stream().mapToInt(e -> e.tripPeriod.end).max().orElse(-1);
    }

    @Override
    public double price() {
        return this.subProducts.stream().mapToDouble(p -> p.price()).sum();
    }
}
