public class Rectangular implements Shapes {

    private int aSide;
    private int bSide;

    public Rectangular(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public double calculateArea() {
        return aSide * bSide;
    }

    @Override
    public double calculatePerimeter() {
        return exists() ? 2 * (aSide + bSide) : 0;
    }

    public boolean isSquare() {
        return aSide == bSide;
    }

    public double calculateDiagonal() {
        return Math.sqrt((aSide * aSide) + (bSide * bSide));
    }

    public boolean exists() {
        return aSide > 0 && bSide > 0;
    }
}
