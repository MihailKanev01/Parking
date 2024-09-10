package automated_parking;

public class Engine {
    private int quantity;
    private int maxQuantity;
    private EngineType engineType;

    public Engine(int quantity, int maxQuantity, EngineType engineType) {
        this.quantity = quantity;
        this.maxQuantity = maxQuantity;
        this.engineType = engineType;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
