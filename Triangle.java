
package lab11_oop;

public class Triangle implements Shape {
    
    public double height;    
    public double base;


    public Triangle(){
        height = 0;
        base = 0;
    }

    public Triangle(double height, double base){
        
        this.height = height;
        this.base = base;
    }

    public double area(){
        return 0.5 * height * base;
    }


}
