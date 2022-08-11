package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double size;
    private Boolean isStamped;

    public Stamp(String stampName, double size, boolean isStamped) {
        this.stampName = stampName;
        this.size = size;
        this.isStamped = isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.size, size) == 0
                && this.isStamped.equals(stamp.isStamped)
                && this.stampName.equals(stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, size, isStamped);
    }
    @Override
    public String toString(){
        return "Stamp{" + "stampName='" + stampName + '\'' + ", size='"
                + size + '\'' + ", Stamped=" + isStamped + '}';
    }
}