package com.github.sioncheng.effectivejava.ch4;

//immutable
public final class Complex {

    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE  = new Complex(1, 0);
    public static final Complex I    = new Complex(0, 1);

    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        if (re == 0 && im == 0) return ZERO;
        if (re == 1 && im == 0) return ONE;
        if (re == 0 && im == 1) return I;

        return new Complex(re,im);
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im,
                re * c.im + im * c.re);
    }

    public Complex dividedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;

        if (this == obj) return true;

        if (obj instanceof Complex) {
            Complex that = (Complex) obj;

            return Double.compare(this.re, that.re) == 0
                    && Double.compare(this.im, that.im) == 0;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Double.hashCode(37 * this.re + this.im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
