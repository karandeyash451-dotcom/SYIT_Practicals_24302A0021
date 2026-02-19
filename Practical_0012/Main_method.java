package practical_5;
public class Practical_5 {
 public static void main(String[] args) {
 System.out.println("CAR DEYAILS");
 Car c1 = new Car(100,"MH 01 0001","101010",100);
 c1.displayDetails();
 System.out.println("\n");
 System.out.println("BUS DETAILS");
 Bus b1 = new Bus(30,50,"MH 01 1010", "1010", 100);
 b1.displayDetails();
 System.out.println("\n");
 System.out.println("BIKE DETAILS");
 Bike b2 = new Bike("MH 01 1010", "1010", 100);
 b2.displayDetails();

 }

}
