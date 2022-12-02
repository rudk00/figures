package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    private final double x;
    private final double y;
    private final double r;

    public Circle(Point mid, double r){
        x = mid.getX();
        y = mid.getY();
        this.r = r;
    }
    @Override
    public double area(){
        return Math.PI * Math.pow(r,2);
    }
    @Override
    public String pointsToString(){
        return "(" + x + "," + y + ")";
    }
    @Override
    public Point leftmostPoint(){
        return new Point((x - r),y);
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + r + "]";
    }
}


