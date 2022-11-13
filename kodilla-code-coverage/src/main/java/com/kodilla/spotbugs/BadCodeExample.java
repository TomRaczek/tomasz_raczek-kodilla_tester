package com.kodilla.spotbugs;

import static java.lang.Math.PI;
import java.util.Objects;

public class BadCodeExample {
    private String type;

    public static double getPi() {
        return PI;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadCodeExample badCodeExample = (BadCodeExample) o;

        return Objects.equals(type, badCodeExample.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}