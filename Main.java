public class Main {

    public static void main(String[] args) {
        Nameable nameable = new Car("Audi", "A8L");
        nameable.print();
        nameable = new House("Moscow City");
        nameable.print();
    }
}

interface Nameable {

    void print();
}

class Car implements Nameable {
    private String name;
    private String model;

    Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, model);
    }
}

class House implements Nameable {
    private String name;

    String getName() {
        return name;
    }

    House(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}