package ru.ssau.tk.valeria.practice;

public class NamedPoint extends Point {

    String name;

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public void setName(double x, double y, double z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return super.getX();
    }

    public double getY() {
        return super.getY();
    }

    public double getZ() {
        return super.getZ();
    }

    public NamedPoint() {
        super(0.0, 0.0, 0.0);
        this.name = "Origin";
    }
}
