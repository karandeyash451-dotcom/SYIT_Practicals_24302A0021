package practical_5;
public class Car extends Vehicle{
 double ratePerKM;
 public Car(double ratePerKM, String vehicleNumber, String engineNumber, double distance) {
 super(vehicleNumber, engineNumber, distance);
 this.ratePerKM = ratePerKM;
 }
 @Override
 double calculateFare() {
 return distance*ratePerKM;
 }
 @Override
 void displayDetails() {
 System.out.println("VEHICLE NUMBER : "+vehicleNumber);
 System.out.println("DISATNCE : "+distance);
 System.out.println("ENGINE NUMBER : "+getengineNumber());
 System.out.println("RATE PER KM : "+ratePerKM);
 System.out.println("FARE : "+calculateFare());
 }

}
