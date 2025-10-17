package problem6;

public class Square extends Forme{
    private double a;


    public Square(double a) {
        this.a = a;
    }

    public double getSurface() {
        return Math.round(this.a * this.a * 100.0) / 100.0;
    }


    @Override
    public String toString() {
        return "Square (side " + a + " cm)";
    }
}
