package strategy;

import java.util.Objects;

public final class Cart {
    private final double subtotal;
    private DiscountStrategy strategy;

    public Cart(double subtotal, DiscountStrategy strategy) {
        if (!Double.isFinite(subtotal) || subtotal < 0) {
            throw new IllegalArgumentException("O subtotal deve ser finito e não negativo.");
        }

        this.subtotal = subtotal;
        setDiscountStrategy(strategy);
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "Informe uma estratégia de desconto.");
    }

    public double total() {
        return strategy.apply(subtotal);
    }
}
