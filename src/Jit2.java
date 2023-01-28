public class Jit2 {
    public static void main(String[] args) {
        Shape square = new Square(111.23);
        Shape rectangle = new Rectangle(345.33, 234.56);
        for (int i = 0; i < 10_000_000; i++) {
            test(square);
            test(rectangle);
        }
    }

    static void test(Shape shape) {
        double area = 0;
        for (long i = 0; i < 100_000L; i++) {
            area = shape.area();
        }
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
            Integer[] integers = new Integer[1_000];
            for(int i = 0; i < integers.length; i++){
                integers[i] = i;
            }
            return side * side;
        }
    }
}
