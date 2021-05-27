
package lab11_oop;

public class Runner {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        
        shapes[0] = new Rectangle(3.2, 4.1);

       
        shapes[2] = new Circle(6.6);
        
        
        shapes[1] = new Triangle(2.4, 2.8);

        double areas[] = CalculateAreas.func(shapes);

        for (double a : areas) {
            if(a>1)
            System.out.println("For Rectangle: \n" );
            System.out.println("Area of Rectangle = "+areas[0]+"\n----------------");
            break;
        }
        
        for (double a : areas) {
            if(a>3)
                System.out.println("For Circle: \n" );
                System.out.println("Area of Circle = "+areas[2]+"\n----------------");
            break;
        }

        for (double a : areas) {
            if(a>2)
                System.out.println("For Triangle: \n" );
                System.out.println("Area of Triangle = "+areas[1]);
            break;
        }

        
    }
}
