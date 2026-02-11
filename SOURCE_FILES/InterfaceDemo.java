interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Report implements Printable, Showable {
    public void print() {
        System.out.println("Printing report");
    }

    public void show() {
        System.out.println("Showing report");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Report r = new Report();
        r.print();
        r.show();
    }
}
