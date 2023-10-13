public class CircleRunner {
    public static void main(String[] args) {
        Circle radius = new Circle(5.0);
        System.out.println(radius.getInfo());
        radius.setRadius(9.2);
        System.out.println(radius.getInfo());
    }
}
