public class TestSimpleCircle {
    /**Main method
     * @param args */
    public static void main(String[] args){
        //Create a circle with radius 1
        SimpleCircle circle1 =new SimpleCircle() ;
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        
        //create a circle with a radius 25
        SimpleCircle circle2 = new SimpleCircle(25) ;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea()) ;
        
        //Create a circle with a radius 125
        SimpleCircle circle3 =new SimpleCircle(125) ;
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
         
        //Modify circle radius
        circle2.radius = 100; //or circle2.setRadius(100)
        System.out.println("The area of the circle of radius " + circle2.radius + " is " +circle2.getArea()) ;
    }
}
class SimpleCircle {
    /** The radius of this circle*/
    double radius = 1;
    /**Construct a circle object */
    SimpleCircle() {
    }
    /** Construct a circle object */
    SimpleCircle (double newRadius){
        radius = newRadius ;
    }
    /**Return the area of the circle*/
    double getArea() {
        return radius * radius *Math.PI ;
    }
    /**Return the perimeter of the circle*/
    double getPerimeter() {
        return 2 * radius *Math.PI ;
    }
    /** Set new radius for the circle */
    double setRadius(double newRadius) {
        return radius = newRadius;
    }
}