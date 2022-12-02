package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;
    private final double x3;
    private final double y3;
    private final double x4;
    private final double y4;
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;
    public Quadrilateral(Point a, Point b, Point c, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        x1 = a.getX();
        y1 = a.getY();
        x2 = b.getX();
        y2 = b.getY();
        x3 = c.getX();
        y3 = c.getY();
        x4 = d.getX();
        y4 = d.getY();
    }
    @Override
    public double area(){
        Figure triangle1 = new Triangle(a,b,c);
        Figure triangle2 = new Triangle(a,c,d);
        return triangle1.area() + triangle2.area();
    }
    @Override
    public String pointsToString(){
        return "(" + x1 + "," + y1 + ")(" + x2 + "," + y2 + ")(" + x3 + "," + y3 + ")(" + x4 + "," + y4 + ")";
    }
    @Override
    public Point leftmostPoint(){
        double maxLeftX = Math.min( Math.min(x1,x2), Math.min(x3,x4) );
        if (maxLeftX == x1){
            return new Point(x1,y1);
        } else if (maxLeftX == x2) {
            return new Point(x2,y2);
        } else if (maxLeftX == x3) {
            return new Point(x3,y3);
        } else return new Point(x4,y4);
    }
}

