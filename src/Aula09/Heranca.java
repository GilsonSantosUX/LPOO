public class Child extends Heranca{
    public String name;

    public int someMethod(){
        return 4;
    }
}

public class Heranca {
    public int someMethod() {
        return 3;
    }
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.someMethod());
    }
}