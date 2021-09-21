package ru.ssau.tk.valeria.practice;

public class Points {
    public double x;
    public double y;
    public double z;

    public Points (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void setX (double x){this.x = x;}
    double getX (){return x;}

    void setY (double y){this.y = y;}
    double getY (){return y;}

    void setZ (double z){this.z = z;}
    double getZ (){return z;}

    public static Points enlarge(Points point, double someNumber){
        return new Points(point.getX()*someNumber, point.getY()*someNumber, point.getZ()*someNumber);
    }
    public static double sum(double pointOne, double pointTwo){
        return pointOne + pointTwo;
    }
    public static double subtract(double pointOne, double pointTwo){
        return pointOne - pointTwo;
    }
    public static double multiply(double pointOne, double pointTwo){
        return pointOne * pointTwo;
    }
    public static double divide(double pointOne, double pointTwo){
        return pointOne / pointTwo;
    }


}
