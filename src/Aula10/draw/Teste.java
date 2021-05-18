

public class Teste{
    public static void main(String[] args){
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2,6);

        circle.draw();
        System.out.println(circle.getArea());

        rectangle.draw();
        System.out.println(rectangle.getArea());
    }
}