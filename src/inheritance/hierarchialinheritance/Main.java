package inheritance.hierarchialinheritance;

public class Main {
    public static void main(String[] args) {

       //type objectVariable          initialization (object)
        Shape circleShape = new Circle();
        Shape rectangleShape = new Rectangle();

        circleShape.draw();
        rectangleShape.draw();
    }
}
