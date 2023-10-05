/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point_and_line;

/**
 *
 * @author alexf
 */
public class Line {
    private Point begin;
    private Point end;

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1,int y1 , int x2,int y2) {
        this.begin = new Point(x1,y1);
        this.end = new Point(x2,y2);
    }
    
    public double getLength(){
        return Math.sqrt(Math.pow(end.getX()-begin.getX(), 2)+Math.pow(end.getY()-begin.getY(), 2)); 
    }
}