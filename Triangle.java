public class Triangle implements Shapes {

    int aSide;
    int bSide;
    int cSide;

    public Triangle(int aSide, int bSide, int cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = this.calculatePerimeter() * 1.0 / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - aSide) *
                (halfPerimeter - bSide) * (halfPerimeter * cSide));
    }

    @Override
    public double calculatePerimeter() {
        return exists() ? aSide + bSide + cSide : 0;
    }

    public boolean isEquilateral() {
        return aSide == bSide && aSide == cSide;
    }

    public boolean isIsosceles() {
        return aSide == bSide || aSide == cSide || bSide == cSide;
    }

    public boolean isRight() {
        return aSide == bSide || bSide == cSide || aSide == cSide;
    }

    public boolean exists() {
        return aSide < bSide + cSide && bSide < aSide + cSide &&
                cSide < aSide + bSide;
    }
}
