package Money;

public class FactoryMany {
    public static Money getValuta(TypeMany typeMany, double count) {
        switch (typeMany) {
            case RUB -> {
                return new RUB(count);
            }
            case USD -> {
                return new USD(count);
            }
            default -> {
                throw new RuntimeException("not this sort of valuta");
            }
        }

    }
}
