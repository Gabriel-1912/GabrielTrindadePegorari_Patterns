package strategy;

public final class FixedDiscount implements DiscountStrategy {
    private final double amount;

    public FixedDiscount(double amount) {
        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException("O desconto fixo deve ser finito e não negativo.");
        }

        this.amount = amount;
    }

    @Override
    public double apply(double subtotal) {
        return Math.max(0, subtotal - amount);
    }
}
