package practical_5;
public abstract class Vehicle {
 String vehicleNumber;
 private String engineNumber;
 double distance;
 public Vehicle(String vehicleNumber, String engineNumber, double distance) {
 this.vehicleNumber = vehicleNumber;
 this.engineNumber = engineNumber;
 this.distance = distance;
 }

 public String getengineNumber(){
 return engineNumber;
 }

 abstract double calculateFare();
 abstract void displayDetails();
}
