import java.text.DecimalFormat;
import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dd = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// ============Variables==========================================

		int x; // 1, 2 or 3
		double radius;
		double circleAreaR;
		int radiusOrC;
		double circ;
		double circleAreaC;
		double rectangleSide1;
		double rectangleSide2;
		double rectangleArea;
		double triangleH;
		double triangleB;
		double triangleA;

		// ============Variables===========================================

		/////////////////////////////////////

		System.out.println("Welcome to my area calculator");
		System.out.println("Please choose one of the following things to calculate: ");

		do { // DoWhile to loop unknown input for x (shapes)

			System.out.println("1: Area of a cirle");
			System.out.println("2: Area of a square/rectangle");
			System.out.println("3: Area of a triangle");

			x = dd.nextInt();
			// ==================================================CIRCLE======================================================
			if (x == 1) { ///// If Circle is chosen

				System.out.println("You chose Circle.");

				do {
					System.out.println("Do you have the 1:radius or the 2:circumference"); // Radius or Circumference?
					radiusOrC = dd.nextInt(); // Radius or Circumference input
					if (radiusOrC == 1) { // IF Radius is chosen
						System.out.println("please enter the radius of the circle:"); // Radius input

						radius = dd.nextDouble();

						circleAreaR = Math.PI * radius * radius; // Area of a circle using the radius

						System.out.println("the area of the circle is " + df.format(circleAreaR)); // Print Area using
																									// Radius

					} else if (radiusOrC == 2) { // IF Circumference is chosen

						System.out.println("please enter the circumference of the circle:"); // Circumference input

						circ = dd.nextDouble();

						circleAreaC = (circ * circ) / (Math.PI * 4); // Area of a circle using circumference

						System.out.println("The area of the circle is " + df.format(circleAreaC)); // Print Area using
																									// Circumference

					} else {
						System.out.println("error"); // <-----If input is unknown print error
					} //
						//
				} while (radiusOrC != 1 && radiusOrC != 2); // <-----If input is unknown then Loop

				// =================================================CIRCLE==========================================================

				/////////////////////////////////////////

				// =================================================RECTANGLE========================================================

			} else if (x == 2) { // If Square/Rectangle is chosen

				System.out.println("You chose square/rectangle");
				System.out.println("Please enter the Length:");

				rectangleSide1 = dd.nextDouble(); // Length input

				System.out.println("Please enter the Width:");

				rectangleSide2 = dd.nextDouble(); // Width input

				rectangleArea = rectangleSide1 * rectangleSide2; // Area of the rectangle

				System.out.println("The area is: " + df.format(rectangleArea));

				// =================================================RECTANGLE=========================================================

				///////////////////////////////////////

				// ====================================================TRIANGLE======================================================
			} else if (x == 3) { // If Triangle is chosen

				System.out.println("You chose Triangle");
				System.out.println("Please enter the height of the triangle");
				
				triangleH = dd.nextDouble();
				
				System.out.println("Please enter the base of the triangle:");
				
				triangleB = dd.nextDouble();
				
				triangleA = (triangleH * triangleB) / 2;
				
				System.out.println("The area of the triangle is: " + df.format(triangleA));
				
			} else {	// If the input for the shapes is unknown
				System.out.println("Unknown answer");
			}
		} while (x != 1 && x != 2 && x != 3); // if input is not 1, 2 or 3 then loop /// First DoWhile END
	}

}
