package 第四次作业;

public class TestSimpleCircle {
	public static void main(String[] args) {
		SimpleCircle circlel=new SimpleCircle();
		System.out.println("The area of the circle of radius"+ circlel.radius + 
			"is " + circlel.getAreaO);
		SimpleCircle circ1e2 =new SimpleCircle(125);
		System.out.println("The area of the circle of radius"+ circlel.radius + 
				"is " + circlel.getAreaO);
		SimpleCircle circ1e2 =new SimpleCircle(100);
		System.out.println("The area of the circle of radius"+ circlel.radius + 
				"is " + circlel.getAreaO);
		SimpleCircle circ1e2 =new SimpleCircle(25);
		System.out.println("The area of the circle of radius"+ circlel.radius + 
				"is " + circlel.getAreaO);
		double radius;
		SimpleCircleO {
			radius=1;
		}
		SimpleCircle(double newRadius) {
			radius=newRadius;
		}
		double getAreaO {
			return radius*radius*Math.PI;
		}
		double getPerimeter() {
			return 2*radius*Math.PI;
		}
		void setRadius(double newRadius) {
			radius=mewRadius;
		}
	}

}
