public class Jit {
    public static void main(String[] args) {
        Shape square = new Square(111.23);
        Shape rectangle = new Rectangle(345.33, 234.56);
        for (int i = 0; i < 10; i++) {
            test(square);
            test(rectangle);
        }
    }

    static void test(Shape shape) {
        double area = 0;
        for (long i = 0; i < 100_000_000_000L; i++) {
            area = shape.area();
        }
        System.out.println(area);
    }

    interface Shape {
        double area();
    }

    static class Rectangle implements Shape {
        private final double width, height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }
    }

    static class Square implements Shape {
        private final double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }
    }
}
