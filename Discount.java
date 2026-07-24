import java.util.function.Function;

public class Discount {

    public static void main(String[] args) {

        Function<Double, Double> discount =
                price -> price * 0.15;

        double result = discount.apply(5000.0);

       System.out.println("FeatureA Discount = " + result);
    }
}