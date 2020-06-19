package number;

import java.util.Objects;

public class ComplexNumber {
    private double re;
    private double im;

    public double getIm() {
        return im;
    }

    public double getRe() {
        return re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void setRe(double re) {
        this.re = re;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber)) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.getRe(), getRe()) == 0 &&
                Double.compare(that.getIm(), getIm()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRe(), getIm());
    }


}
