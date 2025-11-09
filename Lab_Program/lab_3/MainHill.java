package Lab_Program.lab_3;
class HillStations {
    // methods
 void location() {
     System.out.println("Location is in India");
 }
    // methods
 void famousFor() {
     System.out.println("Famous for its beautiful hill stations");
 }
}
class Manali extends HillStations {
    // overriding methods
 void location() {
     System.out.println("Manali is in Himachal Pradesh");
 }
    // overriding methods
 void famousFor() {
     System.out.println("It is famous for Hadimba Temple and adventure sports");
 }
}
class Mussoorie extends HillStations {
        // overriding methods
 void location() {
     System.out.println("Mussoorie is in Uttarakhand");
 }
        // overriding methods
 void famousFor() {
     System.out.println("It is famous for education institutions");
 }
}
class Gulmarg extends HillStations {
    // overriding methods
 void location() {
     System.out.println("Gulmarg is in J&K");
 }
    // overriding methods
 void famousFor() {
     System.out.println("It is famous for skiing");
 }
}

public class MainHill {
 public static void main(String[] args) {
    // creating object of parent class
     HillStations obj;
    // referencing to child class objects
     obj = new Manali();
     obj.location();
     obj.famousFor();

     System.out.println();
    // referencing to child class objects
     obj = new Mussoorie();
     obj.location();
     obj.famousFor();

     System.out.println();
    // referencing to child class objects
     obj = new Gulmarg();
     obj.location();
     obj.famousFor();
 }
}


