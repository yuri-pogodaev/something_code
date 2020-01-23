package base;

abstract public class BasePolygon extends AbstractBase{
    private double corners;
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }

    protected double calculatePolygonArea(double corners, double side) {
        //S=n·a^2/(4·tg(360°/2n))
        //a — сторона правильного многоугольника,n — число сторон правильного многоугольника
        return (corners * Math.pow(side, 2)) / (4 * Math.tan(360.0 / (2 * corners)));
    }

    @Override
    public double countBaseArea() {
        return calculatePolygonArea(getCorners(), getSide());
    }
}
