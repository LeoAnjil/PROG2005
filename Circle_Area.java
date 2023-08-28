
/**
 * this program calculates the area of the circle.
 *
 * @author (Anjil Khadka)
 * @version (28 aug 2023)
 */
public class Circle_Area
{
    // instance variables - replace the example below with your own
    private double radius = 2.5;
    private double area;

    /**
     * Constructor for objects of class Circle_Area
     */
    public Circle_Area()
    {
        
    }

    public static void main(String[] args){
        Circle_Area circle1 = new Circle_Area();
        circle1.getArea();
    }
    
    
    public void getArea()
    {
       this.area = this.radius * this.radius * 3.14;
       System.out.println("!The Area of the Circle = "+this.area);
    }
}
