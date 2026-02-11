class Product {
    int id;
    String name;
    double price;

    Product(int i, String n, double p) {
        id = i;
        name = n;
        price = p;
    }

    void display() {
        System.out.println(id + "  " + name + "  " + price);
    }
}

public class ProductArray {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product(1, "Pen", 10.5);
        products[1] = new Product(2, "Book", 50.0);
        products[2] = new Product(3, "Bag", 800.0);

        System.out.println("ID  Name  Price");
        for (Product p : products) {
            p.display();
        }
    }
}
