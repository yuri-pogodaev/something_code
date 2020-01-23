package base;

public abstract class BaseRound extends Base {
    public BaseRound() {
        int radius = getRadius();
        int height = getHeight();
    }

    public double calculateBaseArea(int radius, int height) {
        //S = Pi*(radius^2)
        return Math.PI * Math.pow(radius, 2);
    }
}
