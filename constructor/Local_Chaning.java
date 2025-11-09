package constructor;

class Car3 {
    private String name;
    private int mileage;
    private int cost;

    // Zero parameterized constructor
    public Car3() {
        this("BMW", 10, 10000000); // calling parameterized constructor
        System.out.println("Zero-parameter constructor called");
    }

    // Parameterized constructor
    public Car3(String name, int mileage, int cost) {
        this.name = name;
        this.mileage = mileage;
        this.cost = cost;
        System.out.println("Parameterized constructor called");
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    public int getCost() {
        return cost;
    }
}

public class Local_Chaning {
    public static void main(String[] args) {

        Car3 c1 = new Car3();

        System.out.println(c1.getName());
        System.out.println(c1.getMileage());
        System.out.println(c1.getCost());

        System.out.println("========================");

        Car3 c2 = new Car3("Maruti", 50, 5000000);

        System.out.println(c2.getName());
        System.out.println(c2.getMileage());
        System.out.println(c2.getCost());
    }
}


