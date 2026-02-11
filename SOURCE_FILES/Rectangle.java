class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        length = 1;
        breadth = 1;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 3);

        System.out.println("Area of default rectangle: " + r1.area());
        System.out.println("Area of 5x3 rectangle   : " + r2.area());
    }
}
