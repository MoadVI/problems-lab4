package problem6;

public class Circle extends Forme {
    private float r;

    public Circle(float r) {
        this.r = r;
    }
    @Override
    public double getSurface() {
        return Math.round(3.14 * this.r * this.r * 100.0) / 100.0;
    }


    @Override
    public String toString() {
        return "Circle (radius " + r + ")";
    }


}
