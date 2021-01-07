package 第九次作业;
package chapter13;
public class Question6 {
	public static void main(String [] args) {
        ComparableCircle circle1 = new ComparableCircle(3);
        ComparableCircle circle2 = new ComparableCircle(4);
        if (circle1.compareTo(circle2) == 1)
            System.out.println("circle1 is bigger");
        else if (circle1.compareTo(circle2) == -1)
            System.out.println("circle2 is bigger");
        else if (circle1.compareTo(circle2) == 0)
            System.out.println("circle1 is the same as circle2");
        ComparableRectangle rectangle = new ComparableRectangle(2,4);
        System.out.println(circle1.getArea() > rectangle.getArea() ? "circle1 bigger than rectangle" : "rectangle is bigger than circle1");
    }
}
class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public Object max(ComparableCircle o1, ComparableCircle o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }

    public int compareTo(ComparableCircle o) {
        if (super.getArea() > o.getArea())
            return 1;
        else if (super.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

}
