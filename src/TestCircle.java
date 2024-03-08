public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(2.4,"blue");
        //System.out.println(c.radius);
        //cannot access radius directly outside the class
        // as it is a private variable
        System.out.println(c.getRadius());
        System.out.println(c.toString());
        System.out.println(c);

    }
}
