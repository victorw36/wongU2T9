public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle triangle = new RightTriangle(3, 4);
        System.out.println(triangle.hypotenuse());

        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        System.out.print(triangle2.hypotenuse());
    }
}
