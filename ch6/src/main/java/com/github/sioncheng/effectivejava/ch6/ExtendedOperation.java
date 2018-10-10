package com.github.sioncheng.effectivejava.ch6;

public enum ExtendedOperation implements Operation {

    EXP("^") {
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String symbol;

    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public static ExtendedOperation fromString(String s) {
        switch (s) {
            case "^":
                return EXP;
            case "%":
                return REMAINDER;
            default:
                throw new IllegalArgumentException();
        }
    }
}
