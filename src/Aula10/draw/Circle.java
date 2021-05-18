package draw;

public class Circle implements Drawable{
    private double radius;
    public Circle(double r){
        this.radius = r;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle!");
    }
    
    public double getArea(){
        return PI * radius * radius;
    }

    public double getRadius(){
        return getArea();
    }

    }