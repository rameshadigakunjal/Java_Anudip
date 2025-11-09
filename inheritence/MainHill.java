package inheritence;


class HillStations {
 void location() {
     System.out.println("Location is in India");
 }

 void famousFor() {
     System.out.println("Famous for its beautiful hill stations");
 }
}

class Manali extends HillStations {
 void location() {
     System.out.println("Manali is in Himachal Pradesh");
 }

 void famousFor() {
     System.out.println("It is famous for Hadimba Temple and adventure sports");
 }
}

class Mussoorie extends HillStations {
 void location() {
     System.out.println("Mussoorie is in Uttarakhand");
 }

 void famousFor() {
     System.out.println("It is famous for education institutions");
 }
}

class Gulmarg extends HillStations {
 void location() {
     System.out.println("Gulmarg is in J&K");
 }

 void famousFor() {
     System.out.println("It is famous for skiing");
 }
}

public class MainHill {
 public static void main(String[] args) {
     HillStations obj;

     obj = new Manali();
     obj.location();
     obj.famousFor();

     System.out.println();

     obj = new Mussoorie();
     obj.location();
     obj.famousFor();

     System.out.println();

     obj = new Gulmarg();
     obj.location();
     obj.famousFor();
 }
}


