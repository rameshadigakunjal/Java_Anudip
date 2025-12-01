package Collection;

import java.util.TreeSet;

class Car implements Comparable<Car>{
	int cost;
	Car(int cost){
		this.cost = cost;
	}
	public String toString() {
		return "Car [cost" + cost + "]";
	}
	@Override
	public int compareTo(Car o) {
		return this.cost - o.cost;
	}
	
}

public class ExampleOCmparableof {
	
	public static void main(String[] args) {
		Car c1 =new Car(20);
		Car c2 =new Car(30);
		Car c3 =new Car(40);
		
		TreeSet<Car> ts = new TreeSet<Car>();
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);

		for(Car c : ts)
		{
		    System.out.println(c);
		}
		
	}

}
