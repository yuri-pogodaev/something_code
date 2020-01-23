package base;

public class CircleBase extends AbstractBase {
    private double radius;

    public CircleBase(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double returnSide() {
        return radius;
    }

    double calculateCircleArea(double radius) {
        //S = Pi*(radius^2)
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double countBaseArea() {
        return calculateCircleArea(getRadius());
    }
}