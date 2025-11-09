package constructor;


class Car2 {
   private String name;
    private int mileage;
    private int cost;

    // Zero parameterized constructor
    public Car2() {
        name = "BMW";
        mileage = 10;
        cost = 10000000;
    }

    // Parameterized constructor
    public Car2(String name, int mileage, int cost) {
        this.name = name;
        this.mileage = mileage;
        this.cost = cost;
    }
    
    public String  getName() {
    	return name;
    	
    }
    public int getmileage() {
        return mileage;
    }
    
    public int getcost() {
    	return cost;
    }

}

public class Car_Product {

	public static void main(String[] args) {
		Car2 c2 = new Car2();
		
		System.out.println(c2.getName());
		System.out.println(c2.getmileage());
		System.out.println(c2.getcost());
		
		System.out.println("========================");
		System.out.println("========================");
		
        Car2 c3 = new Car2("Maruti", 50, 5000000);

        System.out.println(c3.getName());
        System.out.println(c3.getmileage());
        System.out.println(c3.getcost());
	}

}

  

