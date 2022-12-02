package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;
    private final double x3;
    private final double y3;
    private final double a;
    private final double b;
    private final double c;

    public Triangle(Point A, Point B, Point C) {
        x1 = A.getX();
        y1 = A.getY();
        x2 = B.getX();
        y2 = B.getY();
        x3 = C.getX();
        y3 = C.getY();
        a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        if (!(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a)){
            throw new IllegalArgumentException();
        }
    }
    @Override
    public double area() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public String pointsToString(){
        return "(" + x1 + "," + y1 + ")(" + x2 + "," + y2 + ")(" + x3 + "," + y3 + ")";
    }
    @Override
    public Point leftmostPoint(){
        double maxLeftX = Math.min( Math.min(x1,x2), x3 );
        if (maxLeftX == x1){
            return new Point(x1,y1);
        } else if (maxLeftX == x2) {
            return new Point(x2,y2);
        } else return new Point(x3,y3);
    }
}

