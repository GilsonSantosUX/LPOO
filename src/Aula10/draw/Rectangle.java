package draw;

public class Rectangle implements Drawable{
    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }

    public double getArea(){
        return this.height * this.width;
    }
}