package practical_5;
public class Bike extends Vehicle{
 public Bike(String vehicleNumber, String engineNumber, double distance) {
 super(vehicleNumber, engineNumber, distance);
 }
 @Override
 double calculateFare() {
 return distance*40;
 }
 @Override
 void displayDetails() {
 System.out.println("VEHICLE NUMBER : "+vehicleNumber);
 System.out.println("DISATNCE : "+distance);
 System.out.println("ENGINE NUMBER : "+getengineNumber());
 System.out.println("FARE : "+calculateFare());
 }

}
