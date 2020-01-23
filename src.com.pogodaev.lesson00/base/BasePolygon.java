package base;

abstract public class BasePolygon extends Base {

    protected double calculateAreaBase(int numberOfAngles, double lengthOfEdge) {
        //S=n·a^2/(4·tg(360°/2n))
        //a — сторона правильного многоугольника,n — число сторон правильного многоугольника
        return (numberOfAngles * Math.pow(lengthOfEdge, 2)) / (4 * Math.tan(360.0 / (2 * numberOfAngles)));
    }
}
