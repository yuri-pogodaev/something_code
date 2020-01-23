package base;

abstract public class Base {

    private int radius;
    private int height;
    private int numberOfAngles;
    private int lengthOfEdge;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumberOfAngles() {
        return numberOfAngles;
    }

    public void setNumberOfAngles(int numberOfAngles) {
        this.numberOfAngles = numberOfAngles;
    }

    public int getLengthOfEdge() {
        return lengthOfEdge;
    }

    public void setLengthOfEdge(int lengthOfEdge) {
        this.lengthOfEdge = lengthOfEdge;
    }
}
