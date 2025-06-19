package starcraft;

public class SiegeTank extends GroundUnit {
    private boolean siegeMode;

    public void toggleSiegeMode() {
        this.siegeMode = !siegeMode;
    }

    @Override
    public String toString() {
        return "SiegeTank";
    }
}
