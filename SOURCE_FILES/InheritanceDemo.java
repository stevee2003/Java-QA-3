class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Employee extends Person {
    double salary;

    void displayEmployee() {
        displayPerson();
        System.out.println("Salary: " + salary);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Charlie";
        e.age = 30;
        e.salary = 50000.0;
        e.displayEmployee();
    }
}
