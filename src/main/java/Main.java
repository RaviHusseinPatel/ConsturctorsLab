public class Main {
    public static void main(String[] args) {


        Circle circle1 = new Circle(1.22, 3);
        Circle circle2 = new Circle(1, 4);

        System.out.println(circle1.getRadius());
        System.out.println(circle1.getCircumfrence());
        circle2.setRadius(3.21);
        System.out.println(circle2.radius);
        System.out.println(circle2.getCircumfrence());

        // Rectangle

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.setLength(6);
        rectangle1.setWidth(2);

        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getArea());

     ///Customer Real World Example

        CustomerAccount person1 = new CustomerAccount();
        CustomerAccount person2 = new CustomerAccount();


    }

}
